package com.dkelly205.flyway.demo.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {

    private Long id;
    private String email;
    private String firstname;
    private String lastname;
}
