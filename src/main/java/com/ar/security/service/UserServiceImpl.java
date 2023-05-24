package com.ar.security.service;

import com.ar.security.domain.model.entity.User;
import com.ar.security.domain.persistence.UserRepository;
import com.ar.security.domain.service.UserService;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final String entity = "User";
    private final UserRepository userRepository;
    private final Validator validator;

    public UserServiceImpl(UserRepository userRepository,Validator validator){
        this.userRepository = userRepository;
        this.validator = validator;
    }

    @Override
    public List<User> getAll(){
        return userRepository.findAll();
    }

}
