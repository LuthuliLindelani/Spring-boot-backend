package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.employee;
import com.example.demo.service.employeeService;

@RestController
@RequestMapping("/employee")
public class employeeResources {
    //first we bring the service to use
    public final employeeService EmployeeService;

    public employeeResources(employeeService EmployeeService){
        this.EmployeeService = EmployeeService;
    }


    //first we get or retrieve all the employee
    @GetMapping
    public ResponseEntity<List<employee>> getAllEmployees(){
        List<employee> Employees= EmployeeService.findAllEmployees();
        return new ResponseEntity<>(Employees,HttpStatus.OK);
    }

@GetMapping("/find/{id}")
    public ResponseEntity<employee> getEmployeesById(@PathVariable("id") Long id){
        employee Employees= EmployeeService.findEmployeesById(id);
        return new ResponseEntity<>(Employees,HttpStatus.OK);
    }
}
