package school;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class StudentController 
{
	@Autowired
	StudentService studentService;

	public void start()
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int n=0;

		while(n<6)
		{
			System.out.println("Enter 1- enrollment "
					+ "2-update "
					+ "3- remove by Id "
					+ "4-print the list "
					+ "5-serach by Id "
					+ "6-exit"
					+ "");


			System.out.println("Enter your input");
			n= sc.nextInt();

			switch (n) 
			{
			case 1:

				int id=0,marks=0,age=0;
				String name;

				System.out.println("Enter name :");
				name= sc.next();
				System.out.println("Enter Id");
				id=sc.nextInt();
				System.out.println("Enter age");
				age=sc.nextInt();
				System.out.println("Enter marks");
				marks=sc.nextInt();

				Student s1= new Student();
				s1.setId(id);
				s1.setName(name);
				s1.setAge(age);
				s1.setMarks(marks);

				int a=studentService.addStudent(s1);
				System.out.println("Successfully enrolled");
				break;


			case 2:

				int id2=0,marks2=0,age2=0;
				String name2;

				System.out.println("Enter Id");
				id2=sc.nextInt();

				Student s2 = new Student();
				s2.setId(id2);

				System.out.println("Enter name :");
				name2= sc.next();
				System.out.println("Enter age");
				age2=sc.nextInt();
				System.out.println("Enter marks");
				marks2=sc.nextInt();

				s2.setAge(age2);
				s2.setName(name2);
				s2.setMarks(marks2);

				int a2=studentService.updateDetails(s2);
				break;


			case 3:

				int id3=0;
				System.out.println("Enter Id");
				id3=sc.nextInt();

				int a3= studentService.deleteStudentDetail(id3);

				break;


			case 4:

				List<Student> studentList= studentService.getAllStudents();
				for (Student student : studentList) 
				{
					System.out.println(student.getId()+" "+student.getAge()+" "+student.getName());
				}
				break;

			case 5:
				
				int id5=0;
				System.out.println("Enter Id");
				id5=sc.nextInt();
				List<Student> studentList1= studentService.getbyId(id5);
				for (Student student : studentList1) 
				{
					System.out.println(student.getId()+" "+student.getAge()+" "+student.getName());
				}
				break;
				
			case 6:
				break;
			default:
				break;
			}
		}
	}
}
