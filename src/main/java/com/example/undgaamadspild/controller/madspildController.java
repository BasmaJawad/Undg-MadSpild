package com.example.undgaamadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class madspildController {


    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }

}
