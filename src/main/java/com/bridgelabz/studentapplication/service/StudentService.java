package com.bridgelabz.studentapplication.service;

import com.bridgelabz.studentapplication.entity.StudentEntity;
import com.bridgelabz.studentapplication.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> students() {
        return studentRepository.findAll();
    }

    public StudentEntity getStudentById(int id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        if (studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity getStudentByRollNo(int rollNo) {
        Optional<StudentEntity> studentEntity = studentRepository.findByRollNo(rollNo);
        if (studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity getStudentByFirstName(String name) {
        Optional<StudentEntity> studentEntity = studentRepository.findByFirstName(name);
        if (studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity getStudentByLastName(String name) {
        Optional<StudentEntity> studentEntity = studentRepository.findByLastName(name);
        if (studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public String deleteStudent(int id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        if (studentEntity.isPresent()) {
            studentRepository.delete(studentEntity.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }
}
