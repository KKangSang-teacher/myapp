package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = context.getBean("student", Student.class);
        student.setName(("홍길동"));
        System.out.println(student.getName());


        Address address = context.getBean(Address.class);
        address.setLocation("서울");
        Employee employee=context.getBean(Employee.class);
        System.out.println(employee.getAddress().getLocation());


        // @component를 사용하여 스캔
        Department department = context.getBean(Department.class);
        department.setName("개발팀");
        System.out.println(department.getName());

        employee.setName(("을지문덕"));
        Company company=context.getBean((Company.class));
        company.getEmployeeName();

    
    
    
    }
}