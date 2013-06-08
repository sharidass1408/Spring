package com.nbna.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	/*
	 *If there are multiple advice for a method. Defining a point cut helps
	 *us avoid typing the expression multiple times. 
	 */
	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}

	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice run. Get Method called");
	}
	
	/*
	 * Point cut is that location in the code where an advise needs to be applied.
	 */
	@Pointcut("execution(public * getCircle(..))")
	public void allGetters(){		
	}
}
