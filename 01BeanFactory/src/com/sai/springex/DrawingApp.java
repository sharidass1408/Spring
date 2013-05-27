package com.sai.springex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

//@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args){
		
		/*Triangle t = new Triangle();
		t.draw();*/
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t = (Triangle) factory.getBean("triangle");
		t.draw();		
	}
	
}
