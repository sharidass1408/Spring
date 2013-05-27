package com.nbna.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		
		try {
			System.out.println("Before advice");
			proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		
		System.out.println("After finally");
	}
	
	
	public void allSetters(){		
	}
	
}
