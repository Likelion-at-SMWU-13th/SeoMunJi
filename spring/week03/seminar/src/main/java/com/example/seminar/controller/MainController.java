package com.example.seminar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(
            @PathVariable String color,
            Model page) {
        page.addAttribute("username", "babylion");
        page.addAttribute("color", color);
        return "home.html";
    }
}
