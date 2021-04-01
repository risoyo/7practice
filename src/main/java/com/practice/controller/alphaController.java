package com.practice.controller;

import com.practice.dto.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
@Validated
public class alphaController {
    @RequestMapping(path = "/request/test")
    @ResponseBody
    public String url(@RequestBody String loginData){
        System.out.println("loginData");
        System.out.println("8080 get");
        return loginData;
    };
}
