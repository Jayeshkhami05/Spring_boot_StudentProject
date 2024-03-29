package com.example.Student_Project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student_Project.entity.Student;

@Repository
public interface Student_repo extends JpaRepository <Student, Integer> {

}

