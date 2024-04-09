package com.example.cramSchool.mapper;

import com.example.cramSchool.dto.A002Request;
import com.example.cramSchool.dto.A003InsertDto;
import com.example.cramSchool.entity.TStudentsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface A003Mapper {
    public int insertStudent(A003InsertDto insertDto);
}
