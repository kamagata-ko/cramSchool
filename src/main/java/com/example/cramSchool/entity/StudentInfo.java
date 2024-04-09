package com.example.cramSchool.entity;

import lombok.Data;

@Data
public class StudentInfo {
    /**
     * 学生名
     */
    private String name;
    /**
     * 曜日
     */
    private String bookingweek;
    /**
     * コース名
     */
    private String coursename;
    /**
     * 料金
     */
    private Integer price;
}
