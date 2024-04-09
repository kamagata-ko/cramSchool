package com.example.cramSchool.controller.B;


import com.example.cramSchool.dto.B.B001InsertDto;
import com.example.cramSchool.service.B.B001Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/B001")
public class B001Controller {

    private final B001Service service;

    @RequestMapping("/init")
    public String init(Model model){
        B001InsertDto dto = new B001InsertDto();
        model.addAttribute("B001", dto);
        return "B/B001";
    }

    @RequestMapping("/register")
    public String register(B001InsertDto dto, Model model) throws  Exception{
        var result = service.create(dto);
        model.addAttribute("B001", result);
        return "B/B001";
    }
}
