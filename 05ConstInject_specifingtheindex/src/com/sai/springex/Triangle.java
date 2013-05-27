package com.sai.springex;

public class Triangle {

	public String type;
	public int height;
	
	
	public Triangle(String type){
		System.out.println("Triangle object instantiated");
		this.type=type;
		System.out.println("Assigned the value injected by spring to member variable");
	}
	
	public Triangle(String type, int height){
		System.out.println("Triangle object instantiated");
		this.type=type;
		this.height=height;
		System.out.println("Assigned the value injected by spring to member variable");
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/
		
	public void draw(){		
		if(height ==0)
			System.out.println(getType()+ "Triangle drawn");
		else
			System.out.println(getType()+ " Triangle drawn with height " + getHeight());
	}
}
