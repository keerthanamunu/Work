package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import model.Student;
import peri.StudentDAO;

@Path("/exception")
public class ExceptionExample {
	
	/*public void insertStudent(Student obj) throws Exception{
		System.out.println("inside service WS");
		StudentDAO sdao = new StudentDAO();
		sdao.insertStudent(obj);
		System.out.println("inside service WS"+obj.getId());
	}*/
	
	@GET
	public void method1()
	{
		int a=1/0;
		System.out.println(a);
	}
}
