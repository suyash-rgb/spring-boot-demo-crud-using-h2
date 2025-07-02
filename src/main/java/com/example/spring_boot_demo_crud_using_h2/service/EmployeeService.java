package com.example.spring_boot_demo_crud_using_h2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_boot_demo_crud_using_h2.entity.Employee;
import com.example.spring_boot_demo_crud_using_h2.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        //to check
        employeeRepository.save(employee);
        return employee;
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee existingEmployee = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        existingEmployee.setFirstName(updatedEmployee.getFirstName());
        existingEmployee.setLastName(updatedEmployee.getLastName());
        existingEmployee.setGender(updatedEmployee.getGender());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());
        existingEmployee.setSalary(updatedEmployee.getSalary());

        return employeeRepository.save(existingEmployee);
    }


}
