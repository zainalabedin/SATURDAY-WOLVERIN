package com.upskill.java_5;

public class Singleton {

	private Singleton() {
		
		
	}
	private static Singleton Singletoneobj = new Singleton();
	 
	public static Singleton getInstance() {
		return Singletoneobj;
		
	//
	}
	
	public static void demo() {
		System.out.println("demo method for singletone class");
	}
	}


