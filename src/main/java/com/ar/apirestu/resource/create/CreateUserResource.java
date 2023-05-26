package com.ar.apirestu.resource.create;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResource {

    @JsonIgnore
    private Long userId;
    private String username;
    private String email;
    private String password;

}
