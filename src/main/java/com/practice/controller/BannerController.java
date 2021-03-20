package com.practice.controller;

import com.practice.dto.PersonDTO;
import com.practice.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Validated
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping(path = "/name/{name}")
    @ResponseBody
    public boolean getByName(@PathVariable String name){
       return bannerService.getByName(name);
    };
}
