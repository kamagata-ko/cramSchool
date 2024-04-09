package com.example.cramSchool.service.B;

import com.example.cramSchool.entity.TAccountInfo;

public interface IB002Service {
    TAccountInfo login(String email, String password) throws Exception;
}
