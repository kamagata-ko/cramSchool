package com.example.cramSchool.entity;

import lombok.Data;

@Data
public class priceInfo {
    /**
     * 学生名
     */
    private String name;
    /**
     * 合計金額
     */
    private Integer totalPrice;
}
