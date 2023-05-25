package com.ar.apirestu.resource.show;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {
    private long userId;
    private String userName;
    private String email;
    private String password;
}
