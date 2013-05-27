package com.nbna.diexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

			
	public static void main(String[] args) {
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle) apx.getBean("righttriangle");
		t.drawShape();

	}

}
