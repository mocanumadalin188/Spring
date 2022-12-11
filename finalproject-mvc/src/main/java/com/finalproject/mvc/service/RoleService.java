package com.finalproject.mvc.service;

import com.finalproject.mvc.controller.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    void saveRolesAtStartup(List<RoleDTO> roles);
}
