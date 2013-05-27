package com.nbna.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	/*
	 * By specifying the package name and class name we will able to restrict this aspect 
	 * to that particular class
	 */
	@Before("execution(public String com.nbna.model.Circle.getName())")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}

}
