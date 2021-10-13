package com.bridgelabz.studentapplication.repository;

import com.bridgelabz.studentapplication.entity.StudentEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    Optional<StudentEntity> findByFirstName(String firstName);

    Optional<StudentEntity> findByLastName(String lastName);

    Optional<StudentEntity> findByRollNo(int rollNo);
}
