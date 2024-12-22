package com.assignment.projectapplication.controllers;
//package com.assignment.projectapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index"; // Renders index.html or index.jsp from the templates directory
    }

    @GetMapping("/form")
    public String form() {
        return "form"; // Renders form.html or form.jsp from the templates directory
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name, @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "success"; // Renders success.html or success.jsp from the templates directory
    }
}
