package com.sai.springex;

public class Triangle {

	public String type;
	
	public Triangle(){
		System.out.println("Triangle object instantiated");
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
	public void draw(){		
		System.out.println(getType()+ "Triangle drawn");
	}
}
