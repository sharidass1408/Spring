package com.nbna.diexample;

import java.util.List;

public class Triangle {

	private String typeoftriangle;
	private List<Point> points;
	
	
	public String getTypeoftriangle() {
		return typeoftriangle;
	}

	public void setTypeoftriangle(String typeoftriangle) {
		this.typeoftriangle = typeoftriangle;
	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	

	public void drawShape(){
		
		System.out.println(getTypeoftriangle() + " triangle is drawn");
		
		System.out.println("The following are the co-ordinates:");
		
		for(Point point: points){
			System.out.println("point = (" + point.getX()+","+ point.getY() +")");	
		}
		
		
	}

}
