package school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context1= new ClassPathXmlApplicationContext("annotation.xml");
		StudentController ec = (StudentController)context1.getBean("studentController");
		System.out.println("in mainnS");
		ec.start();
	}

}
