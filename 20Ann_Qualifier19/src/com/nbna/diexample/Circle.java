package com.nbna.diexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Autowired
	@Qualifier("circleRelated")
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
