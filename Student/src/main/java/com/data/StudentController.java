package com.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @PostMapping
    public Student addUser(@RequestBody Student user) {
        return repo.save(user);
    }

    @GetMapping
    public List<Student> getUsers() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }
}