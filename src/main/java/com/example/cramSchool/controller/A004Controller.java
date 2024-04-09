package com.example.cramSchool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/A004")
public class A004Controller {
    @RequestMapping("init")
    public String init(){
        return "A004";
    }

}
