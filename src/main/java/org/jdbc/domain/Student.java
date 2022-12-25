package org.jdbc.domain;

import java.util.Date;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String gender;
    private int grade;
    private Date dob;

    public Student() {
    }

    public Student(int id, String firstname, String lastname, String gender, int grade, Date dob) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.grade = grade;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    public java.sql.Date getDob() {
        return (java.sql.Date) dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dob=" + dob +
                '}';
    }
}
