package com.example.herokudemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmptyController {

    @GetMapping
    public String empty() {
        return "/time";
    }
}
