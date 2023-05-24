package com.ar.security.domain.service;

import com.ar.security.domain.model.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> getAll();

}
