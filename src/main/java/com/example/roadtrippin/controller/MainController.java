package com.example.roadtrippin.controller;

import com.example.roadtrippin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/trip-app")
    public String welcome(Model model) {
        model.addAttribute("user", new User());
        return "welcome";
    }

    @GetMapping("/trip-app/desktop")
    public String desktop() {
        return "desktop";
    }

    @GetMapping("/trip-app/add-expense")
    public String addExpense() {
        return "expense";
    }

    @GetMapping("/trip-app/user-details")
    public String userDetails() {
        return "user";
    }

    @GetMapping("/trip-app/users")
    public String users() {
        return "users";
    }

    @GetMapping("/trip-app/split")
    public String splitExpenses() {
        return "split";
    }

}
