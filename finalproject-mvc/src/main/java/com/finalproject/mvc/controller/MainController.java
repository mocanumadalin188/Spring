package com.finalproject.mvc.controller;

import com.finalproject.mvc.controller.dto.UserRegistrationDTO;
import com.finalproject.mvc.controller.dto.UserUpdateDTO;
import com.finalproject.mvc.service.MovieService;
import com.finalproject.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("userToUpdate", new UserUpdateDTO());
        model.addAttribute("loggedInUser", userService.getCurrentLoggedInUser());
        return "index";
    }

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserRegistrationDTO());
        return "registration";
    }

    @GetMapping("/movies")
    @PreAuthorize("hasRole('ADMIN')")
    public String showMoviesAndActors(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return "movies";
    }
}
