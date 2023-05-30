package com.ar.security.api.rest;

import com.ar.apirestu.resource.create.CreateUserResource;
import com.ar.apirestu.resource.show.UserResource;
import com.ar.apirestu.resource.update.UpdateUserResource;
import com.ar.security.domain.service.UserService;
import com.ar.security.mapping.mappers.UserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/users",produces = "application/json")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService,UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("all")
    public List<UserResource> getAllUser(){
        return userMapper.toListResource(userService.getAll());
    }

    @GetMapping("{id}")
    public UserResource getById(@PathVariable long id){
        return userMapper.toResource(userService.getById(id));
    }

    @PostMapping
    public UserResource createUser(@RequestBody CreateUserResource userResource) {
        return userMapper.toResource(userService.create(userMapper.createResourceToModel(userResource)));
    }

    @PutMapping("{id}")
    public UserResource updateUser(@PathVariable Long id, @RequestBody UpdateUserResource userResource){
        return userMapper.toResource(userService.update(id,userMapper.updateResourceToModel(userResource)));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        return userService.delete(id);
    }
}
