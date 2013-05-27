package com.nbna.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	/*
	 * This after runs irrespective to weather the method is successfully or not
	 */
	/*@After("args(name)")
	public void stringArgumentMethods(String name){
		
		System.out.println("A method that takes String arguments has been called " + name);
	}*/
	/*
	 * This after runs only if the method runs successfully 
	 */
	@AfterReturning("args(name)")
	public void stringArgumentsMethods(String name){		
		System.out.println("A method that takes String arguments has been called " + name);
	}
	
	@AfterThrowing("args(name)")
	public void stringArgumentMethods(String name){
		
		System.out.println("Exception occured while performing operation ");
	}
	
	
}
