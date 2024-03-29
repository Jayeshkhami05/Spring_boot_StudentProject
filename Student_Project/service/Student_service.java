package com.example.Student_Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_Project.entity.Student;
import com.example.Student_Project.repo.Student_repo;

@Service

public class Student_service {

	@Autowired
	private Student_repo repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public List<Student> getAll(){
		return repo.findAll();
	}
	
	public Student get(int id ) {
		Optional<Student> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public Student updatedStudent(Student student,int id ) {
		Optional<Student> optional=repo.findById(id);
		Student dbstudent=new Student();
		if(optional.isPresent()) {
			dbstudent= optional.get();
			student.setId(dbstudent.getId());
			return repo.save(student);
		}
		return null;
	}
	
	public Student deleteStudent (int id) {
		Optional<Student> optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return optional.get();
		}
		return null;
		
	}
}
