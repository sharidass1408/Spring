package com.nbna.diexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

			
	public static void main(String[] args) {
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		/*
		 * Prints the points for parent triangle
		 */
		Triangle pt = (Triangle) apx.getBean("parenttriangle");
		pt.drawShape();
		
		/*
		 * To Demo that list gets overridden
		 */
		Triangle t = (Triangle) apx.getBean("righttriangle");
		t.drawShape();
		
		/*
		 * To Demo that list gets merged
		 */
		Triangle et = (Triangle) apx.getBean("equilateraltriangle");
		et.drawShape();

	}

}
