package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Company {
    @Autowired
    private Employee employee;
    public Company( Employee employee){

    }  

    public void getEmployeeName(){
        System.out.println(employee.getName());
    }

}
