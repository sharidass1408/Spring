package com.nbna.diexample;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {
	
		
	public static void main(String[] args) {
		
		AbstractApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		
		apx.registerShutdownHook();
		Shape sc= (Shape) apx.getBean("circle");
		sc.drawShape();
		System.out.println(	apx.getMessage("greeting", null, "Default Hello Message", null));
	}

}
