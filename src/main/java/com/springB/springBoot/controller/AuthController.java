package com.springB.springBoot.controller;


import com.springB.springBoot.payload.LoginDto;
import com.springB.springBoot.payload.RegisterDto;
import com.springB.springBoot.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
//    @PostMapping(value = { "/login", "/signin" })
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
        String response = authService.login(loginDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> register (@RequestBody RegisterDto registerDto) {
        String response = authService.register(registerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
