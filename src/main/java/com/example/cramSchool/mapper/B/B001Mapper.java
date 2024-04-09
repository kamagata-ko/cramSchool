package com.example.cramSchool.mapper.B;

import com.example.cramSchool.dto.B.B001InsertDto;
import com.example.cramSchool.entity.TAccountInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface B001Mapper {
    TAccountInfo create(B001InsertDto request);
    TAccountInfo selectByEmail(String email);
}
