package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController  {

    // 사번을 하드코딩 또는 환경 변수로 설정할 수 있습니다.
    private static final String userId = "82022894";  // 여기에 자신의 사번을 입력하세요

    // GET 방식으로 /api/v1/user로 요청이 올 때 사번을 반환하는 메서드
    @GetMapping("/user")
    public String getUser() {
        return "사번: " + userId;
    }

}
