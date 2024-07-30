package com.test;

import org.springframework.stereotype.Component;

//@Bean 을 개별적으로 추가하지 않음.
@Component
public class Department {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
