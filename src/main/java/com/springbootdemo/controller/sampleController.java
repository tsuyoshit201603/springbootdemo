package com.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sampleController {
    @GetMapping
    public String index() {
        return "index";
    }
}