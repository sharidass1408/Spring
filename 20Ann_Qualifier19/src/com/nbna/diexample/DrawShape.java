package com.nbna.diexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {
	
		
	public static void main(String[] args) {
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape sc= (Shape) apx.getBean("circle");
		sc.drawShape();

	}

}
