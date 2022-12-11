package com.finalproject.mvc.service;

import com.finalproject.mvc.controller.dto.UserRegistrationDTO;
import com.finalproject.mvc.controller.dto.UserUpdateDTO;
import com.finalproject.mvc.entity.Role;
import com.finalproject.mvc.entity.User;
import com.finalproject.mvc.repository.RoleRepository;
import com.finalproject.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    @Transactional
    public User save(UserRegistrationDTO registrationDto) {
        User user;
        User foundUser = userRepository.findByEmail(registrationDto.getEmail());
        if (foundUser == null) {
            Role role = roleRepository.findByName("USER");
            user = new User(registrationDto.getFirstName(),
                    registrationDto.getLastName(),
                    registrationDto.getEmail(),
                    passwordEncoder.encode(registrationDto.getPassword()),
                    Collections.singletonList(role));
        } else {
            throw new RuntimeException("User already exists");
        }
        return userRepository.save(user);
    }

    @Override
    public User update(UserUpdateDTO userUpdateDTO, String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User does not exist");
        }
        user.setPassword(passwordEncoder.encode(userUpdateDTO.getPassword()));
        userRepository.save(user);

        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    /**
     * Meant to be run only once at application startup to insert an ADMIN.
     */
    @Override
    @Transactional
    public void saveAdmin(UserRegistrationDTO userRegistrationDto) {
        User user = userRepository.findByEmail(userRegistrationDto.getEmail());
        if (user == null) {
            Role userRole = roleRepository.findByName("ROLE_USER");
            Role adminRole = roleRepository.findByName("ROLE_ADMIN");

            User createdUser = new User(userRegistrationDto.getFirstName(),
                    userRegistrationDto.getLastName(),
                    userRegistrationDto.getEmail(),
                    passwordEncoder.encode(userRegistrationDto.getPassword()),
                    Arrays.asList(userRole, adminRole));

            userRepository.save(createdUser);
        }
    }

    public String getCurrentLoggedInUser() {
        String username;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }

        return username;
    }
}
