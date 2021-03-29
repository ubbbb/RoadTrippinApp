package com.example.roadtrippin.controller;

import com.example.roadtrippin.dto.UserDto;
import com.example.roadtrippin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("trip-app")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public String users(Model model) {
        model.addAttribute("users", userService.list());
        return "users";
    }

    @GetMapping("users/new")
    public String newUser(Model model) {
        model.addAttribute("user", new UserDto());
        return "user-form";
    }

    @PostMapping("users")
    public String saveUser(@ModelAttribute UserDto userDto) {
        userService.create(userDto);
        return "redirect:/trip-app/users";
    }

    @GetMapping("users/{id}")
    public String showUser(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "user-form";
    }

    @GetMapping("users/del/{id}")
    public String deleteUser(@PathVariable int id){
        userService.delete(id);
        return "redirect:/trip-app/users";
    }

}
