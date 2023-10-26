package com.TDDSample.TDDSample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserDTORequest(
        @NotBlank(message = "Pet's name can not be blank")
        @Pattern(regexp = "^[a-zA-Z]+$", message = "The name should only contain letters")
        @Size(max = 25, message = "The name's pet should have a maximum of 25 characters")
        @Size(min = 2, message = "The name's pet should have a minimum of 2 characters")
        String name,
        String email,
        String password


){}