package com.example.cramSchool.dto;

import lombok.Data;

import java.util.Date;

@Data
public class A001Dto {
    private int studentId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Date dateOfBirth;
    private int gender;
}
