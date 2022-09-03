package com.upskill.java_5;

public class Encapsulation {
	
	private String name ="upskill";
	private int ssn =345678927;
	private String username ="zainal";
	
	//setter method
	private void setname(String value) {
		name=value;
		
	}
	
	//getter method
	public String getname() {
		return name;
		
		
		
	}
	private void setssn(int value) {
		ssn=value;
	}
		


	
	public String getusername() {
		return username;
	}
	//public static void main(String[] args) {
		//Encapsulation obj = new Encapsulation ();
		//obj.setname("zainal");
		//System.out.println(obj.getname());
		// TODO Auto-generated method stub

	
public static void main(String[] args) {
	Encapsulation obj = new Encapsulation ();	
	obj.setname("abedin");
	System.out.println(obj.getusername());
	obj.setssn(0);
	System.out.println(obj.getusername());
}
}
