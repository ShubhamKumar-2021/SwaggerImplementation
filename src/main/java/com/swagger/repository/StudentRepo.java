package com.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
