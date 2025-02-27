package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.employee;
import com.example.demo.repository.employeeRepo;
@Service
public class employeeService {
    private employeeRepo EmployeeRepo;


@Autowired //to do all our crude operations
    public employeeService(employeeRepo EmployeeRepo) {
        this.EmployeeRepo = EmployeeRepo;
    }

    //method to add emmployee
    public employee addEmployee(employee Employee){
        Employee.setEmployeeNo(UUID.randomUUID().toString());
                return EmployeeRepo.save(Employee);
    }

    public List<employee> findAllEmployees(){
        return EmployeeRepo.findAll();
    }

    public employee updateEmployee(employee Employee){
        return EmployeeRepo.save(Employee);
    }

    public void deleteEmployee(Long id){
        EmployeeRepo.deleteEmployeeById(id); 
    }

    public employee findEmployeesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEmployeesById'");
    }
    


}
