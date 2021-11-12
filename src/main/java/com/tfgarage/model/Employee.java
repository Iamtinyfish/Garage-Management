package com.tfgarage.model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNum;
    private String email;
    private String cardID;
    private Account account;

    public Employee() {
    }

    public Employee(int id, String name, int age, String gender, String address,
                    String phoneNum, String email, String cardID, Account account) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.cardID = cardID;
        this.account = account;
    }

    public Employee(int id, String name, int age, String gender, String address,
                    String phoneNum, String email, String cardID) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.cardID = cardID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
