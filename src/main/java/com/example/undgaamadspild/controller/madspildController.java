package com.example.undgaamadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class madspildController {


    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/info")
    public String info(){
        return "info";
    }

    @GetMapping("/shop")
    public String shop(){
        return "shop";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/loginPrivate")
    public String loginPrivate(){
        return "loginPrivate";
    }

    @GetMapping("/loginCompany")
    public String loginCompany(){
        return "loginCompany";
    }


}
