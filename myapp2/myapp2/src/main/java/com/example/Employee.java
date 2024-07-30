package com.example;

public class Employee {
    
    private String name;
    private Address address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void displayInfo(){
        System.out.println(this.getName() + this.getAddress().getLocation());
    }
}
