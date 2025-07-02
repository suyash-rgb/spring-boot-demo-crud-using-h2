package com.example.spring_boot_demo_crud_using_h2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot_demo_crud_using_h2.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    Optional<Employee> findById(Long id);

    Optional<List<Employee>> findByDepartment(String department);



}
