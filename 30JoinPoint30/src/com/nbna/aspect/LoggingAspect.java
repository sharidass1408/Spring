package com.nbna.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/* 
	 * Joint point means all the places in the code where we can apply advise. 
	 * In spring AOP we can only define pointcuts for methods.
	 * But if we use AspectJ then we can define a pointcut where a member variable's value is changing
	 * so all the places where a advise can be introduced are called join points.
	 */
	@Before("allGetters()")
	public void LoggingAdvice(JoinPoint joinPoint){
		System.out.println("Advice run. Called by " + joinPoint.toString());
		Object obj = joinPoint.getTarget();
		System.out.println("Object under controll is " + obj);
	}

		
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){		
	}
	
	
}
