package com.example.cramSchool.service.B;

import com.example.cramSchool.dto.B.B001InsertDto;
import com.example.cramSchool.entity.TAccountInfo;

import java.util.function.Predicate;

public interface IB001Service {
    TAccountInfo create(B001InsertDto request) throws Exception;
}

