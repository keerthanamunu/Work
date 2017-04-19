package com.draw;
public class Triangle implements DrawingApp {
	
	private String namei;
	private int height;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
		System.out.println("defaultt");
	}
	
	public String getNamei() {
		return namei;
	}

	public void setNamei(String namei) {
		this.namei = namei;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
	
	/*public Triangle(String name) {
		// TODO Auto-generated constructor stub
		this.namei=name;
	}*/
	
	
	/*public Triangle(int height) {
		// TODO Auto-generated constructor stub
		System.out.println("heighttttt construc");
		this.height=height;
	}*/
	
	
	/*public Triangle(String name,int height) {
		// TODO Auto-generated constructor stub
		this.namei=name;
		this.height=height;
	}*/
	
	public String getName() {
		return namei;
	}

	public void setName(String namei) {
		this.namei = namei;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw of triangle"+getName()+getHeight());
	}
	
	public void myInit()
	{
		System.out.println("traingle init");
	}
	
	public void myDestroy()
	{
		System.out.println("traingle destroy");
	}
	
}
