package com.weel.models.builders;

import com.weel.models.Student;

public class StudentBuilder implements Builder<Student> {

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

    private StudentBuilder(String firstName){
        this.firstName = firstName;
        this.lastName = "";
        this.email = "";
        this.gender = "";
        this.mobile = "";
        this.subject = "";
        this.hobbie = "";
        this.day = "";
        this.month = "";
        this.year = "";
        this.address = "";
        this.state = "";
        this.city = "";
        this.path = "";
    }

    public static StudentBuilder withFirstName(String firstName){
        return new StudentBuilder(firstName);
    }

    public StudentBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public StudentBuilder withGender(String gender){
        this.gender = gender;
        return this;
    }

    public StudentBuilder withMobile(String mobile){
        this.mobile = mobile;
        return this;
    }

    public StudentBuilder withSubject(String subject){
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder withHobbie(String hobbie){
        this.hobbie = hobbie;
        return this;
    }

    public StudentBuilder withDay(String day){
        this.day = day;
        return this;
    }

    public StudentBuilder withMonth(String month){
        this.month = month;
        return this;
    }

    public StudentBuilder withYear(String year){
        this.year = year;
        return this;
    }
    public StudentBuilder withAddress(String address){
        this.address = address;
        return this;
    }

    public StudentBuilder withState(String state){
        this.state = state;
        return this;
    }

    public StudentBuilder withCity(String city){
        this.city = city;
        return this;
    }

    public Student withPath(String path){
        this.path = path;
        return build();
    }

    @Override
    public Student build() {
        return new Student(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPath() { return path;
    }

}
