package com.example.cramSchool.service.B;

import com.example.cramSchool.dto.B.B001InsertDto;
import com.example.cramSchool.entity.TAccountInfo;
import com.example.cramSchool.mapper.B.B001Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
@RequiredArgsConstructor
public class B001Service implements IB001Service {

    private final B001Mapper mapper;

    @Override
    public TAccountInfo create(B001InsertDto request) throws Exception {
        var info =  mapper.selectByEmail(request.getEmail());
        if (!Objects.isNull(info)) throw new Exception("登録済みのメールアドレスです。");
        // パスワードをエンコード
        var entity =  addHashedPassword(request, passwordEncode(request.getPassword()));
        return mapper.create(entity);
    }

    // NOTE: https://docs.spring.io/spring-security/reference/features/authentication/password-storage.html#authentication-password-storage-bcrypt
    public static String passwordEncode(String rawPassword) {
        return new BCryptPasswordEncoder(16).encode(rawPassword);
    }

    public static B001InsertDto addHashedPassword(B001InsertDto args, String password) {
        return B001InsertDto.builder()
                .email(args.getEmail())
                .userName(args.getUserName())
                .password(password)
                .build();
    }
}



