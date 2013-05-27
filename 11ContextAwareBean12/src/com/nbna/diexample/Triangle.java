package com.nbna.diexample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{

	private String typeoftriangle;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
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
		System.out.println("pointA = (" + getPointA().getX()+","+ getPointA().getY() +")");
		System.out.println("pointB = (" + getPointB().getX()+","+ getPointB().getY() +")");
		System.out.println("pointC = (" + getPointC().getX()+","+ getPointC().getY() +")");
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.println("Setting the application context");
		this.context = context;
	}

	@Override
	public void setBeanName(String arg0) {
		
		System.out.println("Name of the bean instantiated is " + arg0);
		
	}

}
