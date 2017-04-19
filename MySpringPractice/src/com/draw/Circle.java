package com.draw;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


@Component
public class Circle implements DrawingApp,ApplicationEventPublisherAware
//,BeanNameAware,InitializingBean,DisposableBean
{
	private ApplicationEventPublisher publisher;
	
	
	
	public ApplicationEventPublisher getPublisher() {
		return publisher;
	}

	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	@Autowired
	private MessageSource meesageSource;
	
	public MessageSource getMeesageSource() {
		return meesageSource;
	}

	public void setMeesageSource(MessageSource meesageSource) {
		this.meesageSource = meesageSource;
	}

	private String name;
	//private String beanName;

	private Point center;
	
	public Point getCenter() {
		return center;
	}

//	@Autowired
	//@Qualifier("pa")
	@Resource(name="pc")
	public void setCenter(Point center) {
		this.center = center;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		DrawEvent e = new DrawEvent(this);
		publisher.publishEvent(e);
		System.out.println("Circleee method "+ getName()+ getCenter().getX());
		System.out.println("Real message : "+this.meesageSource.getMessage("drawing.point",new Object[] {getCenter().getX(), getCenter().getY()},"Default Greeting",null));
		System.out.println("Mesage source : "+this.meesageSource.getMessage("greeting",null,"Default Greeting",null));
		
	}


	/*@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName=beanName;
		System.out.println("beanName is "+beanName);
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean initialized circle"+getCenter().getY());
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean Destroyed   .....enjoy");
	}*/
	
	@PostConstruct
	public void initCircle()
	{
		System.out.println("bean initialized");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("bean destroyed  circle");
	}

	

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
	

}
