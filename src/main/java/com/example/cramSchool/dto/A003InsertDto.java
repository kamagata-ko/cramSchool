package com.example.cramSchool.dto;

import lombok.Data;

import java.sql.Date;
@Data
public class A003InsertDto {
    private String name;
    private String email;
    private String phone;
    private String address;
    private Date dateOfBirth;
    private int gender;
}
