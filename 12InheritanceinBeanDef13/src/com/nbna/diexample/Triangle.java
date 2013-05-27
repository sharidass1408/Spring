package com.nbna.diexample;

public class Triangle {

	private String typeoftriangle;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public String getTypeoftriangle() {
		return typeoftriangle;
	}

	public void setTypeoftriangle(String typeoftriangle) {
		this.typeoftriangle = typeoftriangle;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void drawShape(){
		
		System.out.println(getTypeoftriangle() + " triangle is drawn");
		System.out.println("The following are the co-ordinates:");
		if(getPointA()!=null)
		System.out.println("pointA = (" + getPointA().getX()+","+ getPointA().getY() +")");
		if(getPointB()!=null)
		System.out.println("pointB = (" + getPointB().getX()+","+ getPointB().getY() +")");
		if(getPointC()!=null)
		System.out.println("pointC = (" + getPointC().getX()+","+ getPointC().getY() +")");
	}

}
