package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {

    @GetMapping("/hello")
    public Stringhello() {
    // HMTLテンプレートに　hello-spirng.html を指定
        return "hello-spirng";
    }
}
