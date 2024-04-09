package com.example.cramSchool.entity;

import lombok.Data;

import java.util.Date;


@Data
public class TStudentsDto {
    private int studentId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Date dateOfBirth;
    private int gender;
}
