package com.finalproject.mvc.controller;


import com.finalproject.mvc.controller.dto.UserUpdateDTO;
import com.finalproject.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/update")
public class UserUpdateController {
    @Autowired
    private UserService userService;

    @PostMapping("/{email}")
    public String updateUserAccount(@PathVariable("email") String email,
                                    @ModelAttribute("userToUpdate") UserUpdateDTO userUpdateDTO) {
        userService.update(userUpdateDTO, email);
        return "redirect:/logout";
    }
}
