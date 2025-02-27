package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String jobTittle;
    private String phone;
    private String imgUrl;
    private String employeeNo;

    public employee(){}

    public employee(String name, String email, String jobTittle, String phone, String imgUrl, String employeeNo) {
        this.name = name;
        this.email = email;
        this.jobTittle = jobTittle;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.employeeNo = employeeNo;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getJobTittle() {
        return jobTittle;
    }
    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getEmployeeNo() {
        return employeeNo;
    }
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
    //to_print_out, you dont print out sensetie infirmation
    @Override
    public String toString() {
        return "employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTittle=" + jobTittle + ", phone="
                + phone + ", imgUrl=" + imgUrl + "]";
    }


    
    



}
