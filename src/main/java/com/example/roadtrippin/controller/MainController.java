package com.example.roadtrippin.controller;

import com.example.roadtrippin.dto.ExpenseDto;
import com.example.roadtrippin.service.ExpenseService;
import com.example.roadtrippin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip-app")
public class MainController {

    UserService userService;
    ExpenseService expenseService;

    public MainController(UserService userService, ExpenseService expenseService) {
        this.userService = userService;
        this.expenseService = expenseService;
    }

    @GetMapping("")
    public String desktop(Model model) {
        model.addAttribute("users", userService.list());
        model.addAttribute("expenses", expenseService.list());
        return "home";
    }

    @GetMapping("/users/{id}/expenses")
    public String userExpenses(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "user";
    }

    @GetMapping("/split")
    public String splitExpenses() {
        return "split";
    }

}
