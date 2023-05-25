package com.ar.security.api.rest;

import com.ar.security.domain.model.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users",produces = "application/json")
public class UserController {

    @GetMapping
    public User Welcome(){
        return new User(1L,"Pedro","pedro@gmail.com","pedro1");
    }

}
