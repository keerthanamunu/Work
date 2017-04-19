package com.draw;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		
	}
	
	

	public String toString()
	{
		System.out.println("My String in event");
		return "Draw event occureed";
	}


}
