package com.example.cramSchool.mapper;

import com.example.cramSchool.entity.StudentInfo;
import com.example.cramSchool.entity.StudentRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopMapper {
    List<StudentInfo> selectAll();

    void insert(StudentRequest studentRequest);
}
