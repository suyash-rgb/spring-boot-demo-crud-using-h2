package com.example.spring_boot_demo_crud_using_h2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String gender;

    private String department;

    private long salary;


    

}
