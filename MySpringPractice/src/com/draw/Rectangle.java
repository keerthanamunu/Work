package com.draw;

import java.util.List;

public class Rectangle implements DrawingApp {
	
	private Point pa;
	private Point pb;
	private Point pc;
	
//	private List<Point> plist;
	
	
	
	
	public Point getPa() {
		return pa;
	}


	public void setPa(Point pa) {
		this.pa = pa;
	}


	public Point getPb() {
		return pb;
	}


	public void setPb(Point pb) {
		this.pb = pb;
	}


	public Point getPc() {
		return pc;
	}


	public void setPc(Point pc) {
		this.pc = pc;
	}


	/*public List<Point> getPlist() {
		return plist;
	}




	public void setPlist(List<Point> plist) {
		this.plist = plist;
	}*/




	@Override
	public void draw() {
		// TODO Auto-generated method stub
		/*for (Point point : plist) {
			System.out.println("point x"+point.getX()+"y :"+point.getY());
		}*/
		System.out.println("rectangle draw"+getPa().getX()+": x"+getPa().getY()+": y");
	}

}
