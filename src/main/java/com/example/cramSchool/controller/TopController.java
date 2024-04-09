package com.example.cramSchool.controller;

import com.example.cramSchool.entity.StudentInfo;
import com.example.cramSchool.entity.StudentRequest;
import com.example.cramSchool.entity.priceInfo;
import com.example.cramSchool.mapper.TopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TopController {
    @Autowired
    private TopMapper topMapper;
    @RequestMapping("/top")
    public String top(@ModelAttribute("studentRequest") StudentRequest studentRequest, Model model){
        List<StudentInfo> students = topMapper.selectAll();
        // 料金情報クラスのリストを追加
        List<priceInfo> priceInfos = new ArrayList<>();

        // 名前ごとに料金を格納するマップ
        Map<String, Integer> totalPriceByName = new HashMap<>();

        // 名前ごとに料金を合算する。
        for(StudentInfo student : students){
            String name = student.getName();
            // 格納する値がNullだったら0を格納する。
            Integer price = student.getPrice() != null ? student.getPrice() : 0;

            Integer currentTotal = totalPriceByName.getOrDefault(name, 0);

            totalPriceByName.put(name, currentTotal + price);
        }
        for(Map.Entry<String, Integer> map : totalPriceByName.entrySet()){
            priceInfo pData = new priceInfo();
            pData.setName(map.getKey());
            pData.setTotalPrice(map.getValue());
            priceInfos.add(pData);
        }


        model.addAttribute("studentInfo", students);
        model.addAttribute("priceInfo", priceInfos);
        return "Top";
    }

    @PostMapping("student/confirmation")
    public String confirmation(StudentRequest studentRequest, Model model){
        // topMapper.insert(studentRequest);

        model.addAttribute("studentInfo", studentRequest);

        return "Confirmation";
    }
}
