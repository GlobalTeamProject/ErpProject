package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainContorller {
    
	//처음 접속 시 로그인 페이지 호출
    @GetMapping("/")
    public String loginPage() {
        return "login"; // templates/login.html 파일을 찾습니다.
    }

    //로그인 버튼 클릭 시 대시보드로 이동
    @PostMapping("/login")
    public String loginProcess() {
        return "redirect:/main"; // 리다이렉트가 제대로 작동합니다.
    }

    //메인 페이지 호출
    @GetMapping("/main")
    public String mainPage() {
        return "main"; // templates/main.html을 호출합니다.
    }
    //메인 페이지 호출
    @GetMapping("/salary")
    public String mainSalary() {
    	return "salary"; // templates/salary.html을 호출합니다.
    }
    
    
}
