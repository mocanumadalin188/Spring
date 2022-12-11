package com.finalproject.mvc.service;

import com.finalproject.mvc.controller.dto.RoleDTO;
import com.finalproject.mvc.entity.Role;
import com.finalproject.mvc.mappers.GenericMapper;
import com.finalproject.mvc.repository.RoleRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    private GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @Override
    public void saveRolesAtStartup(List<RoleDTO> roles) {
        roles.forEach(role -> {
            Role oldRole = roleRepository.findByName(role.getName());
            if (oldRole == null) {
                roleRepository.save(mapper.roleDTOToRole(role));
            }
        });
    }
}
