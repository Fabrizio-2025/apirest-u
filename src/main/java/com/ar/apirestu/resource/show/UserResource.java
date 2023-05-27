package com.ar.apirestu.resource.show;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {

    private long userId;
    private String username;
    private String email;
    private String password;
}
