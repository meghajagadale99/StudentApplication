package com.bridgelabz.studentapplication.controller;

import com.bridgelabz.studentapplication.entity.StudentEntity;
import com.bridgelabz.studentapplication.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public List<StudentEntity> students() {

        return studentService.students();
    }

    @GetMapping(value = "/student-find-by-id")
    public StudentEntity getStudentById(@RequestParam int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/student-find-by-firstName")
    public StudentEntity getStudentByFirstName(@RequestParam String firstname) {
        return studentService.getStudentByFirstName(firstname);
    }

    @GetMapping(value = "/student-find-by-lastName")
    public StudentEntity getStudentByLastName(@RequestParam String lastname) {
        return studentService.getStudentByLastName(lastname);
    }

    @GetMapping(value = "/student-find-by-rollNo")
    public StudentEntity getStudentByRollNo(@RequestParam int rollNo) {
        return studentService.getStudentByRollNo(rollNo);
    }

    @GetMapping(value = "/test")
    public String getStudentByRollNo() {
        return "hello";
    }

    @PostMapping(value = "/student")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.addStudent(studentEntity);
    }

    @PutMapping(value = "/student")
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(studentEntity);
    }

    @DeleteMapping(value = "/student")
    public String deleteStudent(@RequestParam int id) {
        return studentService.deleteStudent(id);
    }
}
