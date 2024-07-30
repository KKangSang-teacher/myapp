package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@Bean을 쓰지 않고 component가 있는 것을 스캔하여 자동으로 넣어줌
@ComponentScan(basePackages = "com.test")

public class JavaConfig {
    @Bean
    //Student에 대한 Bean을 만들어줌
    public Student student(){
        return new Student();
    }

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setAddress(address());
        return employee;
        }

    @Bean
    public Address address(){
        return new Address();
    }

}
