package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.employee;
//click on jpaRepository to see all the mothods you
public interface employeeRepo extends JpaRepository<employee, Long> {
    void deleteEmployeeById(Long id);

}
