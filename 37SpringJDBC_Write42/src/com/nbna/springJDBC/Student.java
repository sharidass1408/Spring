package com.nbna.springJDBC;

public class Student {
	
	private int rollno;
	private String name;
	private int quant;
	private int verbal;
	private int total;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public int getVerbal() {
		return verbal;
	}
	public void setVerbal(int verbal) {
		this.verbal = verbal;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString(){
		
		return "Roll number: "+ rollno +"; Name: "+ name + "; Quant: "+quant+ "; Verbal: "+ verbal+ " Total: "+ total;
	}
}
