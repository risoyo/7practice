package com.practice.dto;

import com.practice.valid.PassEqual;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UnifyResponse {
    private String code;

    private String message;

    private String request;
}
