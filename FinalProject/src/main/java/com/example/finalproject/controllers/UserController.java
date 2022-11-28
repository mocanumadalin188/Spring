package com.example.finalproject.controllers;

import com.example.finalproject.dtos.users.UserDTO;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody UserDTO userDTO) throws EntityNotFoundException {
        return new ResponseEntity<>(mapper.userToUserDTO(userService.create(mapper.userDTOToUser(userDTO))), HttpStatus.OK);
    }
}
