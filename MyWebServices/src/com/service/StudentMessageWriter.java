package com.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import model.Student;

@Produces(MediaType.TEXT_PLAIN)
@Provider
public class StudentMessageWriter implements MessageBodyWriter<Student>
{

	@Override
	public long getSize(Student student, Class<?> arg1, Type arg2, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		String output = student.getName()+" : "+student.getAge();
		System.out.println(output.length());
		return output.length();
	}

	@Override
	public boolean isWriteable(Class<?> inputClass, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		System.out.println(inputClass==Student.class);
		return inputClass==Student.class;
	}

	@Override
	public void writeTo(Student student, Class<?> arg1, Type arg2, Annotation[] annotation, MediaType mediaType,
			MultivaluedMap<String, Object> arg5, OutputStream out) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		byte[] bytearr=(student.getName()+" : "+student.getMarks()).getBytes();
		out.write(bytearr);
		
	}

	

}
