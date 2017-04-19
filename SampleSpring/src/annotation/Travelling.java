package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Travelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("annotation.xml");
		
		
		Vehicle v = (Vehicle) context.getBean("car");
		
		v.start();
		v.stop();
		
		
		
			
	
		
		
	}

}
