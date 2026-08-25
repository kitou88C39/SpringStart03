package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class CommonController {

    @GetMapping("/complete")
    private String complete() {
        return "complete";
    }
}
