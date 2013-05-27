package com.nbna.diexample;

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void drawShape() {
		System.out.println(" Circle is drawn");
		System.out.println("The following are the co-ordinates:");
		System.out.println("Center = (" + getCenter().getX()+","+ getCenter().getY() +")");
	
		
	}

	

}
