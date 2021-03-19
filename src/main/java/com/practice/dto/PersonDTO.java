package com.practice.dto;

import com.practice.valid.PassEqual;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@PassEqual(min = 6,max = 15)
public class PersonDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String pass1;

    @NotBlank
    private String pass2;
}
