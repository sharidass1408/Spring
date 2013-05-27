package com.nbna.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("args(name)")
	public void stringArgumentMethods(String name){
		
		System.out.println("A method that takes String arguments has been called " + name);
	}
	
}
