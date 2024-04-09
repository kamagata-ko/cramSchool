package com.example.cramSchool.controller.B;


import com.example.cramSchool.dto.A001Dto;
import com.example.cramSchool.dto.B.B001InsertDto;
import com.example.cramSchool.dto.B.B002Request;
import com.example.cramSchool.service.A001Service;
import com.example.cramSchool.service.B.B001Service;
import com.example.cramSchool.service.B.B002Service;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/B002")
public class B002Controller {

    private final B002Service service;

    private final A001Service a001Service;

    @RequestMapping("/init")
    public String init(Model model){
        B001InsertDto dto = new B001InsertDto(); // 仮でB001のDTOを使用中。
        model.addAttribute("B002", dto);
        return "B/B002";
    }

    @RequestMapping("/login")
    public String login(B002Request request, Model model, HttpSession session) throws Exception{
        var result = service.login(request.getEmail(), request.getPassword());
        model.addAttribute("B002", result);
        List<A001Dto> a001 = a001Service.getStudentsInfo();
        session.setAttribute("account", result);
        model.addAttribute("A001", a001);
        return "A/A001";
    }
}
