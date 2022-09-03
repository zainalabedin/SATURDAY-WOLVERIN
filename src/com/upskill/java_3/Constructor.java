package com.upskill.java_3;

public class Constructor {
	String admin;
	int adage;
	
	public Constructor ( String name,int age) {
		admin=name; 
		adage= age;
	
	}
	public static void main(String[] args) {
		Constructor myobj=new Constructor("zainal",35);
		
		
		System.out.println( myobj.admin);
		System.out.println( myobj.adage);
		
	}

}

