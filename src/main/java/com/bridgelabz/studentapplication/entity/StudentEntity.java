package com.bridgelabz.studentapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentEntity {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int rollNo;
}