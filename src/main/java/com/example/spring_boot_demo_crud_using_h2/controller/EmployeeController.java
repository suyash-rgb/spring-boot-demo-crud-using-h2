package com.example.spring_boot_demo_crud_using_h2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_demo_crud_using_h2.entity.Employee;
import com.example.spring_boot_demo_crud_using_h2.service.EmployeeService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ems/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    @PostMapping("/addNewEmployee")
    public Employee addNewEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }


}
