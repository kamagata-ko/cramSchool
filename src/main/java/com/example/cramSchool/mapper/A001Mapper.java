package com.example.cramSchool.mapper;

import com.example.cramSchool.entity.TStudentsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface A001Mapper {
    public List<TStudentsDto> selectAll();
}
