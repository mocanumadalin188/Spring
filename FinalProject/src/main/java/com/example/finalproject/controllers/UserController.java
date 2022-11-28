package com.example.finalproject.controllers;

import com.example.finalproject.dtos.users.UserDTO;
import com.example.finalproject.exception.EntityNotFoundException;
import com.example.finalproject.mappers.GenericMapper;
import com.example.finalproject.services.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private Validator validator;

    @Autowired
    private UserService userService;

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserDTO userDTO) throws EntityNotFoundException {
        Set<ConstraintViolation<UserDTO>> violations = validator.validate(userDTO);
        ResponseEntity<?> response;
        if (violations.isEmpty()) {
            response = new ResponseEntity<>(mapper.userToUserDTO(userService.create(mapper.userDTOToUser(userDTO))), HttpStatus.OK);
        } else {
            String errorMessage = violations
                    .stream()
                    .map(a -> a.getPropertyPath() + " " + a.getMessage())
                    .collect(Collectors.joining("\n"));
            throw new RuntimeException(errorMessage);
        }
        return response;
    }
}
