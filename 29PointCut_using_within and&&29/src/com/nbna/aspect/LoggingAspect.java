package com.nbna.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	@Before("allGetters() && allTriangleMethods() ")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}

	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice run. Get Method called");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){		
	}
	
	@Pointcut("within(com.nbna.model.Triangle)")
	public void allTriangleMethods(){		
	}
	
	/*
	 * without within writing the same expression
	 */
	
	/*@Pointcut("execution(public * com.nbna.model.Triangle.*(..))")
	public void allTrianglMethods(){		
	}*/
	
}
