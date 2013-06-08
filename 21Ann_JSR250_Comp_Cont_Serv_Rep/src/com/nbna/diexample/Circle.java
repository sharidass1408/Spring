package com.nbna.diexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component 
//@Controller // for controller
//@Service	 // for service class
//@Repository //for Data object

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointc")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct // Executes this method when bean is about to be initialized
	public void initCircle(){
		System.out.println("Init method is called");
	}
	
	@PreDestroy //Executes before bean is about to be destroyed.
	public void destroyCircle(){
		System.out.println("Destroy method is called");
	}

	@Override
	public void drawShape() {
		System.out.println(" Circle is drawn");
		System.out.println("The following are the co-ordinates:");
		System.out.println("Center = (" + getCenter().getX()+","+ getCenter().getY() +")");		
	}	

}
