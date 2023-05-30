package com.ar.apirestu.resource.update;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserResource {
    private Long userId;
    private String username;
    private String email;
    private String password;
}
