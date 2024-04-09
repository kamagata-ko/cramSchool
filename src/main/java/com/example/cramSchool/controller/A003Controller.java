package com.example.cramSchool.controller;

import com.example.cramSchool.dto.A002Request;
import com.example.cramSchool.service.A003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/A003")
public class A003Controller {
    @Autowired
    private A003Service a003Service;

    @RequestMapping("/init")
    public String init(Model model, @Validated A002Request request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<String> errorList = new ArrayList<>();
            for(ObjectError error : bindingResult.getAllErrors()){
                errorList.add(error.getDefaultMessage());
            }
            model.addAttribute("errorList", errorList);
            model.addAttribute("A002Request", request);
            return "A/A002";
        }
        model.addAttribute("A003", request);
        return "A/A003";
    }

    @RequestMapping(value = "register", params = "register", method = RequestMethod.POST)
    public String register(A002Request request){
        a003Service.insertStudent(request);
        return "A/A004";
    }

    @RequestMapping(value = "register", params = "cancel", method = RequestMethod.POST)
    public String cancel(A002Request request, Model model){
        model.addAttribute("A002Request", request);
        return "A/A002";
    }
}
