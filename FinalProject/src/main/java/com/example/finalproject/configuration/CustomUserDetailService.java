package com.example.finalproject.configuration;

import com.example.finalproject.jparepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final com.example.finalproject.entities.User myUser = userRepository.findByEmail(username).orElse(null);
        if (myUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return User.withUsername(myUser.getEmail())
                .password(myUser.getPassword())
                .authorities(myUser.getRole())
                .build();
    }

}
