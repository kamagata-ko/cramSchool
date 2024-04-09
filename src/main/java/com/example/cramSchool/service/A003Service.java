package com.example.cramSchool.service;

import com.example.cramSchool.dto.A002Request;
import com.example.cramSchool.dto.A003InsertDto;
import com.example.cramSchool.mapper.A003Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;


@Service
public class A003Service {
    @Autowired
    private A003Mapper a003Mapper;

    public void insertStudent(A002Request request){
        A003InsertDto insertDto = new A003InsertDto();
        insertDto.setName(request.getName());
        insertDto.setPhone(request.getPhone());
        insertDto.setEmail(request.getEmail());
        insertDto.setAddress(request.getAddress());
        insertDto.setDateOfBirth(Date.valueOf(request.getDateOfBirth()));
        a003Mapper.insertStudent(insertDto);
    }
}
