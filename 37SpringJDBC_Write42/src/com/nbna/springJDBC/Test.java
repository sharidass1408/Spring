package com.nbna.springJDBC;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		
public static void main(String[] args) {
		
		
	  ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");	  
	  //StudentSelectDAO dao = ctx.getBean("simpleSelectDAO",  StudentSelectDAO.class);
	  InsertStudentInfoDAO dao = ctx.getBean("insertStudentInfoDAO",  InsertStudentInfoDAO.class);
	  
	  dao.insertStudentInfo(10,"Tommy", 500, 500);
	}

}
