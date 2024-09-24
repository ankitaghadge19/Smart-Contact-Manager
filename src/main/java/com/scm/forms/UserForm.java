package com.scm.forms;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserForm {

    @NotBlank(message = "Username is required!")
    @Size(min = 3, message = "Min 3 characters are required!")
    private String name;

    @NotBlank(message = "Email is required!")
    @Email(message = "Invalid Email Address!")
    private String email;

    @NotBlank(message = "Password is required!")
    @Size(min = 4, message = "Min 4 characters are required!")
    private String password;

    @Size(min = 8, max = 12, message = "Invalid Phone Number!")
    private String phoneNo;

    @NotBlank(message = "About is required!")
    private String about;
}
