package com.example.bookstore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    String boostoreName;

    @GetMapping("/homepage")

    public String homepage(Model model){
        model.addAttribute("GreenView", boostoreName);
        return ("homepage");

    }


}
