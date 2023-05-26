package com.ar.security.mapping.mappers;

import com.ar.apirestu.resource.create.CreateUserResource;
import com.ar.apirestu.resource.show.UserResource;
import com.ar.security.domain.model.entity.User;
import com.ar.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class UserMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public UserResource toResource(User usermodel) {
        return mapper.map(usermodel, UserResource.class);
    }

    public List<UserResource> toListResource(List<User> stores) {
        return mapper.mapList(stores, UserResource.class);
    }

    public User createResourceToModel(CreateUserResource createProductResource) {
        return mapper.map(createProductResource, User.class);
    }
}
