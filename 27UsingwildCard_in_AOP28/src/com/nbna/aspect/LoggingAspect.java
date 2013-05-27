package com.nbna.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	/*
	 * Apply * wild card for return type and method name
	 * Use .. wild card for accepting any number of arguments
	 */
	@Before("execution(public* get*(..))")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}

}
