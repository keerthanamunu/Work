package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

//import org.eclipse.persistence.oxm.MediaType;

import model.Student;
import peri.StudentDAO;
//resource path
@Path("studentService")
public class StudentService {
	
	List<Student> sl = new ArrayList<Student>();
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/insertStudent")
	//@Consumes({"application/xml","application/json"})
	//@Produces(MediaType.APPLICATION_JSON)
	public void insertStudent(Student obj) throws Exception{
		System.out.println("inside service WS");
		StudentDAO sdao = new StudentDAO();
		sdao.insertStudent(obj);
		System.out.println("inside service WS"+obj.getId());
	}
	
	/*//insert for ArrayList
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/insertStudent")
	public void insertStudent(Student obj) throws Exception{
		System.out.println("inside service WS");
		Student s = new Student();
		s.setName(obj.getName());
		s.setAge(obj.getMarks());
		s.setId(obj.getId());
		s.setMarks(obj.getMarks());
		sl.add(s);
		System.out.println("inside service WS"+obj.getId());
	}*/

	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateStudent(Student obj) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		sdao.updateStudent(obj);
		//return s;
	}
	
	
	@DELETE
	@Path("/delete/{id}")
	public void deleteStudent(@PathParam("id")int id) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		sdao.deleteStudent(id);
		
	}
	
	/*@GET
	public void test()
	{
		System.out.println("helloooo ferom web service");
	}*/
	
	
	/*//annotate with each method
	@GET
	@Path("/studentxml/search")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> selectAll(@DefaultValue("123") @QueryParam("start") int start,@QueryParam("end") int end) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		List<Student> l = sdao.selectAll(start,end);
		return l;
	}
	*/
	
	@GET
	@Path("/studentxml")
	//two get then one has to be specified with path
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces({"application/xml","application/json"})
	//@Produces(MediaType.TEXT_PLAIN)
	public List<Student> selectAllXML() throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		List<Student> l = sdao.selectAll();
		return l;
	}
	
	/*//pathParam
	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student readbyStudentId(@PathParam("id") int id) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		Student s=sdao.readbyStudentId(id);
		System.out.println("inside serviceeeee");
		return s;
	}*/
	
	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student readbyStudentId(@PathParam("id") int id) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		Student s=new Student();
		s.setId(1234);
		System.out.println("inside serviceeeee");
		return s;
	}
	
	
	/*//queryparam===post
	@POST
	@Path("/id")
	//@Produces(MediaType.APPLICATION_JSON)
	public Student readbyStudentId(@QueryParam("id") int id) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		Student s=sdao.readbyStudentId(id);
		return s;
	}*/
	
	/*@POST
	@Path("/id")
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.TEXT_PLAIN)
	public Student readbyStudentId(@QueryParam("id") int id) throws Exception
	{
		StudentDAO sdao = new StudentDAO();
		Student s=sdao.readbyStudentId(id);
		return s;
	}*/
	
	
	@POST
	@Path("/forms")
	//@Consumes("application/x-www-format-urlencoded")
	public void selectAllForm(@FormParam("sname") String username) throws Exception
	{
		/**/
		System.out.println(username);
		
	}
	
	@POST
	@Path("/header")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessage(Student student,@HeaderParam("Content-Type") String cs,@HeaderParam("name") String name)
	{
		System.out.println(cs);
		System.out.println(name);
		ResponseBuilder rs = Response.status(Status.OK).entity(student);
		Cookie c = new Cookie("name", student.getName());
		System.out.println(c.getValue());
		rs.header("Content-Type", "application/json");
		return rs.build();
	}
	
	
	
}
