package com.example.roadtrippin.controller;

import com.example.roadtrippin.dto.ExpenseDto;
import com.example.roadtrippin.service.ExpenseService;
import com.example.roadtrippin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip-app")
public class ExpenseController {

    UserService userService;
    ExpenseService expenseService;

    public ExpenseController(UserService userService, ExpenseService expenseService) {
        this.userService = userService;
        this.expenseService = expenseService;
    }

    @GetMapping("expenses/new")
    public String newExpense(ModelMap model) {
        model.addAttribute("expense", expenseService.create(new ExpenseDto()));
        model.addAttribute("users", userService.list());
        return "expense";
    }

    @PostMapping("expenses")
    public String saveExpense(@ModelAttribute ExpenseDto expenseDto, ModelMap model) {
        expenseService.create(expenseDto);
        model.addAttribute("users", userService.list());
        return "redirect:/trip-app/";
    }

}
