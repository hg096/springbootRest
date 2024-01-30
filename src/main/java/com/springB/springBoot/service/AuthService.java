package com.springB.springBoot.service;

import com.springB.springBoot.payload.LoginDto;
import com.springB.springBoot.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);


}
