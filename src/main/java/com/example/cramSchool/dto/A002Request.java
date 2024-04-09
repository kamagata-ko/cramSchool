package com.example.cramSchool.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class A002Request {
    @NotEmpty(message = "氏名は入力必須項目です。")
    private String name;
    private String email;
    private String phone;
    private String address;
    private String dateOfBirth;
    private int gender;
}
