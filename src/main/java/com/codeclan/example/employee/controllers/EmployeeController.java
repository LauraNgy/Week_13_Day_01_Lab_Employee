package com.codeclan.example.employee.controllers;

import com.codeclan.example.employee.models.Employee;
import com.codeclan.example.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable String id) {
        return employeeRepository.findById(Long.parseLong(id));
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable String id) {
        employeeRepository.deleteById(Long.parseLong(id));
    }

}
