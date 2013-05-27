package com.nbna.diexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component 
//@Controller
//@Service
//@Repository

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointc")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initCircle(){
		System.out.println("Init method is called");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy method is called");
	}
	
	@Autowired
	private MessageSource messageSource;
	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void drawShape() {
		System.out.println(	this.messageSource.getMessage("drawing.circle", null, "Default Hello Message", null));
		System.out.println(	this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()}, "Default Hello Message", null));
	
	}	

}
