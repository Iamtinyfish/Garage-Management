package com.tfgarage.model;

public class Employee {
    private int id;
    private String name;
    private String birthday;
    private boolean isMale;
    private String address;
    private String phone;
    private String email;
    private String cardID;
    private String position;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, boolean isMale, String address, String phone, String email, String cardID, String position) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.isMale = isMale;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cardID = cardID;
        this.position = position;
    }
}
