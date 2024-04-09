package com.example.cramSchool.controller;

import com.example.cramSchool.dto.A002Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/A002")
public class A002Controller {
    @RequestMapping("/init")
    public String init(A002Request request, Model model){
        model.addAttribute("A002Request", request);
        return "A/A002";
    }
}
