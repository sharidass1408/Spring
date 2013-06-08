package com.nbna.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nbna.model.Circle;
import com.nbna.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		//Instantiating application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//If we use getBean which takes name of bean as well as class name then it automatically does 
		//casting for us.
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
		
		Circle c = new Circle();
		c.setName("sai");
		
		System.out.println(c.getName());
		
		/*System.out.println(shapeService.getCircle().getName());		
		System.out.println(shapeService.getTriangle().getName());*/
	}

}
