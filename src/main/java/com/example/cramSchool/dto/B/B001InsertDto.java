package com.example.cramSchool.dto.B;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class B001InsertDto {
    private String userName;
    private String password;
    private String email;
}
