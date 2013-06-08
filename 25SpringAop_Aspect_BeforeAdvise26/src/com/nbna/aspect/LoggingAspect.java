package com.nbna.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // The annotation changes this below class into an advise.
public class LoggingAspect {
	
	/* The below @Before annotation tells the spring container that the below method should
	 * run before the method public String getName() gets executed.
	 * 
	 * @Before - tells when to call ie before or after
	 * "execution(public String getName())" -- tells where to call
	 * LoggingAdvice() -- tells what to call
	 */
	@Before("execution(public String getName())")	
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}

}
