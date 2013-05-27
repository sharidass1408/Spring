package com.nbna.diexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	
	
		
	public static void main(String[] args) {
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		
		/*Triangle t = (Triangle) apx.getBean("righttriangle");
		t.drawShape();
		
		Circle c = (Circle) apx.getBean("circle");
		c.drawShape();*/
		
		Shape s = (Shape) apx.getBean("righttriangle");
		s.drawShape();
		
		Shape sc= (Shape) apx.getBean("circle");
		sc.drawShape();

	}

}
