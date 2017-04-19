package com.draw;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*DrawingApp d= new Triangle();
		d.draw();*/
	
		//BeanFactory f = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		context.registerShutdownHook();//destroys all the beans after the job
		DrawingApp d = (DrawingApp)context.getBean("circle");
		d.draw();
		String x=context.getMessage("greeting",null,"Default Greeting",null);
		System.out.println(x);
	}

}
