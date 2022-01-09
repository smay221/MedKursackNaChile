package com.example.medproject;

public class Employee {

    private String fullName;
    private String speciality;
    private String age;
    private Integer photo;

    public Employee(String fullName, String speciality, String age, Integer photo) {
        this.fullName = fullName;
        this.speciality = speciality;
        this.age = age;
        this.photo = photo;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }


}



