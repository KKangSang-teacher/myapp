package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Student student = new Student();
        // student.setStudentId("1");
        // student.setStudentName("강상희");
        // System.out.println(student.getStudentId());
        // System.out.println(student.getStudentName());
        
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        Student student = context.getBean("student", Student.class);
        student.setStudentId("2");
        student.setStudentName("강감찬");
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());

        // Address address = new Address();
        // address.setLocation("Seoul");
        // Employee employee=new Employee();
        // employee.setName("세종대왕");
        // employee.setAddress(address);
        // employee.displayInfo();

        
        // ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        // Employee employee= context.getBean("employee", Employee.class);

        // Address address= context.getBean("address", Address.class);

    }
}