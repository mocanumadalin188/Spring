package com.example.springdatahibernate.controllers;

import com.example.springdatahibernate.entities.User;
import com.example.springdatahibernate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
    }

    @PutMapping("/{userName}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable("userName") String userName) {
        return new ResponseEntity<>(userService.update(user,userName), HttpStatus.OK);
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity<Void> delete(@PathVariable("userName") String userName) {
        userService.delete(userName);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
