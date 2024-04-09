package com.example.cramSchool.controller;

import com.example.cramSchool.dto.A001Dto;
import com.example.cramSchool.dto.B.B001InsertDto;
import com.example.cramSchool.dto.B.B002Request;
import com.example.cramSchool.service.A001Service;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/A001")
public class A001Controller {
    @Autowired
    private A001Service a001Service;

    @RequestMapping("/top")
    public String init(Model model){
        List<A001Dto> a001 = a001Service.getStudentsInfo();
        model.addAttribute("A001", a001);
        B001InsertDto b002 = new B001InsertDto();
        model.addAttribute("B002", b002);
        return "A/A001";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session, Model model){
        session.removeAttribute("account");
        B001InsertDto dto = new B001InsertDto(); // 仮でB001のDTOを使用中。
        model.addAttribute("B002", dto);
        return "B/B002";
    }
}
