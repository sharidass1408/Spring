package com.nbna.diexample;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {
	
		
	public static void main(String[] args) {
		
		AbstractApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		apx.registerShutdownHook();
		Triangle t = (Triangle) apx.getBean("righttriangle");
		t.drawShape();

	}

}
