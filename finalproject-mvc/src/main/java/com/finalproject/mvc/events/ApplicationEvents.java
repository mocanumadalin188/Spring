package com.finalproject.mvc.events;

import com.finalproject.mvc.controller.dto.RoleDTO;
import com.finalproject.mvc.controller.dto.UserRegistrationDTO;
import com.finalproject.mvc.service.ActorService;
import com.finalproject.mvc.service.MovieService;
import com.finalproject.mvc.service.RoleService;
import com.finalproject.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApplicationEvents {

    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorService actorService;

    @Autowired
    private RoleService roleService;

    // runs after application starts
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        // CREATES ROLES AT STARTUP
        roleService.saveRolesAtStartup(Arrays.asList(new RoleDTO("ROLE_USER"), new RoleDTO("ROLE_ADMIN")));
        // CREATES ADMIN USER AT STARTUP
        UserRegistrationDTO admin = new UserRegistrationDTO
                ("admin", "admin", "admin@yahoo.com", "admin");
        userService.saveAdmin(admin);
    }
}
