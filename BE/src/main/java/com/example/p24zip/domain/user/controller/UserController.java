package com.example.p24zip.domain.user.controller;

import com.example.p24zip.global.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserController {

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<Object>> signup() {
        return ResponseEntity.ok(
            ApiResponse.ok("CREATED", "회원가입을 성공했습니다.")
        );
    }
}
