package com.example.Student_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_Project.entity.Student;
import com.example.Student_Project.service.Student_service;

@RestController
@RequestMapping("Student")
public class Rest {
		@Autowired
		private Student_service service;
		
		
		@PostMapping
	    public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
		}
		
		@GetMapping
		public List<Student> getallStudent() {
			return service.getAll();
		}
		
		@GetMapping("get/{id}")
		public Student getStudent(@PathVariable int  id) {
			return service.get(id);
		}
		
		@PutMapping("update/{id}")
		public Student updatestudent(@RequestBody Student student ,@PathVariable int id) {
			return service.updatedStudent(student,id);
		}
		
		
		// @Requste param :- url mdy ?key=value 
		@DeleteMapping("delete/{id}")
		public Student deleteStudent(@PathVariable int id) {
			return service.deleteStudent(id);
		}
		
}
