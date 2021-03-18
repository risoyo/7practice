package com.prtc.controller;

import com.prtc.dto.PersonDTO;
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
    public PersonDTO url(@RequestBody @Validated PersonDTO loginData){
        System.out.println("loginData");
        return loginData;
    };
}
