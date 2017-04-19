package com.service;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import model.Student;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client =ClientBuilder.newClient();
		WebTarget mainTarget = client.target("http://localhost:8080/MyWebServices/rest");
		WebTarget target = mainTarget.path("studentService/id/123");
		
		Student s =target.request().get(Student.class);
		System.out.println(s.getName());
		
		
		
		Student s1 = new Student();
		s1.setId(567);
		s1.setName("chandraaaaaaa");
		s1.setAge(29);
		s1.setMarks(300);
		
		target =client.target("http://localhost:8080/MyWebServices/rest").path("studentService/insertStudent");
		Response r = target.request().post(Entity.json(s1));
		System.out.println(r);
		
		target = client.target("http://localhost:8080/MyWebServices/rest").path("studentService/studentxml");
		List<Student> list= target.request().get(new GenericType<List<Student>>() {});
		for (Student student : list) {
			System.out.println(student.getId());
		}
		
		
	}

}
