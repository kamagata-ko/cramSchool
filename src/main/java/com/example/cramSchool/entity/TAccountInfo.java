package com.example.cramSchool.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TAccountInfo {
    private int id;
    private String userName;
    private String password;
    private String email;
}
