package com.nbna.springJDBC;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
		
		
	  ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");	  
	  RetrieveStudentInfoDAO dao = ctx.getBean("retrieveStudentInfoDAO",  RetrieveStudentInfoDAO.class);
	  dao.getStudentList();
	  
	}

}
