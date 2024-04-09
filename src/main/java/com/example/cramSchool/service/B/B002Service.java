package com.example.cramSchool.service.B;

import com.example.cramSchool.entity.TAccountInfo;
import com.example.cramSchool.mapper.B.B001Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class B002Service implements IB002Service{

    private final B001Mapper mapper;

    public TAccountInfo login(String email, String password) throws Exception {
        var existedAccount = mapper.selectByEmail(email);
        if (Objects.isNull(existedAccount)) throw new Exception("メールアドレスまたは、パスワードに誤りがあります。");
        if (!verifyPassword(password,existedAccount.getPassword())) throw new Exception("メールアドレスまたは、パスワードに誤りがあります。");
        return existedAccount;
    }

    public static boolean verifyPassword(String raw, String hashed) {
        return new BCryptPasswordEncoder().matches(raw, hashed);
    }
}
