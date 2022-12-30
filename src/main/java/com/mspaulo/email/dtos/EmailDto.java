package com.mspaulo.email.dtos;

import com.mspaulo.email.enums.StatusEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


import java.time.LocalDateTime;

public class EmailDto {

    @NotBlank
    private String ownerRef;
    @Email
    @NotBlank
    private String emailFrom;
    @Email
    @NotBlank
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
    @NotBlank
    private LocalDateTime sendDateEmail;
    @NotBlank
    private StatusEmail statusEmail;
}
