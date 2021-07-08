package com.desenvolvimentoJava.crud.controller;

import com.desenvolvimentoJava.crud.model.User;
import com.desenvolvimentoJava.crud.usecase.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping(value = "/user")
    public ResponseEntity<List<User>> findAll (){

       /*TODO Lista mockada
        List<User> users = new ArrayList<>();

        users.add(new User(1L,"Tiago","1234567789-11",null));
        users.add(new User(2L,"Lucas","321456789-22",null));
        users.add(new User(3L,"Robson","12456789-33",null));
        */
        List<User> users = service.findAll();

        return ResponseEntity.ok().body(users);

    }
}
