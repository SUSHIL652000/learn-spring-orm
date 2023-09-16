package com.lcwd.orm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="jpa_student")
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String about;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;
    // one to many
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addresses=new ArrayList<>();

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
