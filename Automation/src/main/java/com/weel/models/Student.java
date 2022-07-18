package com.weel.models;

import com.weel.models.builders.StudentBuilder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String subject;
    private String hobbie;
    private String day;
    private String month;
    private String year;
    private String address;
    private String state;
    private String city;
    private String path;

    public Student(StudentBuilder studentBuilder){
        firstName = studentBuilder.getFirstName();
        lastName = studentBuilder.getLastName();
        email = studentBuilder.getEmail();
        gender = studentBuilder.getGender();
        mobile = studentBuilder.getMobile();
        subject = studentBuilder.getSubject();
        hobbie = studentBuilder.getHobbie();
        day = studentBuilder.getDay();
        month = studentBuilder.getMonth();
        year = studentBuilder.getYear();
        address = studentBuilder.getAddress();
        state = studentBuilder.getState();
        city = studentBuilder.getCity();
        path = studentBuilder.getPath();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.month = day;
    }



    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPath(){
        return path;
    }


}
