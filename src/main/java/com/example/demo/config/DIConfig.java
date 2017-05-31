package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Student;
import com.example.demo.Teacher;
import com.example.demo.Title;

@Configuration
public class DIConfig {
	
	@Bean
	public Teacher teacher(){
		return new Teacher();
	}
	
	@Bean
	public Student student(){
		return new Student();
	}
		
	@Autowired
	private Student student;
	
	@Bean
	public Title titleShow(){
		Title title=new Title();
		title.setPeople(new Teacher());
		return title;
	}
}
