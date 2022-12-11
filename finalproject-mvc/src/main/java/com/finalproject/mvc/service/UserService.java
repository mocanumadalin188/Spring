package com.finalproject.mvc.service;

import com.finalproject.mvc.controller.dto.UserRegistrationDTO;
import com.finalproject.mvc.controller.dto.UserUpdateDTO;
import com.finalproject.mvc.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO registrationDto);

    User update(UserUpdateDTO userUpdateDTO, String email);

    void saveAdmin(UserRegistrationDTO registrationDto);

    String getCurrentLoggedInUser();
}
