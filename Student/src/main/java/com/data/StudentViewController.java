package com.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentViewController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/display")
    public String viewUsers(Model model) {

        List<Student> users = repo.findAll();

        model.addAttribute("users", users);

        return "Student";
    }
}