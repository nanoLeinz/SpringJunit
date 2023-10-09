package id.aplikasi.karyawan.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;


public class Employee {
    private Integer Id;
    private String name;
    private LocalDateTime dob;
    private String address;

    public Employee(Integer id, String name, LocalDateTime dob, String address) {
        Id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Integer getAges () {
        LocalDate now = LocalDate.now();
        LocalDate dob = this.getDob().toLocalDate();
        return Period.between(dob, now).getYears();
    }
}
