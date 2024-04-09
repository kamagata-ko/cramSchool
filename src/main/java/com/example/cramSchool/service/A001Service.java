package com.example.cramSchool.service;

import com.example.cramSchool.dto.A001Dto;
import com.example.cramSchool.entity.TStudentsDto;
import com.example.cramSchool.mapper.A001Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * A001学生情報一覧画面サービスクラス
 */
@Service
public class A001Service {
    @Autowired
    A001Mapper a001Mapper;

    public List<A001Dto> getStudentsInfo(){
        List<TStudentsDto> studentsEntity = a001Mapper.selectAll();
        List<A001Dto> studentsList = new ArrayList<>();
        for(TStudentsDto student : studentsEntity){
            A001Dto dto = new A001Dto();
            dto.setStudentId(student.getStudentId());
            dto.setName(student.getName());
            dto.setEmail(student.getEmail());
            dto.setPhone(student.getPhone());
            dto.setAddress(student.getAddress());
            dto.setDateOfBirth(student.getDateOfBirth());
            dto.setGender(student.getGender());
            studentsList.add(dto);
        }
        return studentsList;
    }
}
