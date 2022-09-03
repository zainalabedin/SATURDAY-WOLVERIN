package com.upskill.java_6;

public class Multithreading {
/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 


2. Implementing the Runnable Interface */
	
	public static void main(String[] args) {
	int n=5;            //number of threads
	for (int i =0;i<n; i++) {
		 Multithreadingdemo2 obj =new  Multithreadingdemo2();//obj for extending the thread class
		 
		Thread obj2 = new Thread ( new Multithreadingdemo2()); //obj for implementing the runnable interface
		obj.start();
		obj2.start();
		
	}
	

	}

}
class  Multithreadingdemo implements  Runnable {
	public void run() {
		try {
			System.out.println("thread "+ Thread.currentThread().getId() + " is running");
		}
	catch(Exception e) {
			System.out.println("excption is cught");
		}
	}
}
class  Multithreadingdemo2 implements  Runnable {
	public void run() {
		try {
			System.out.println("thread "+ Thread.currentThread().getId() + " is running");
		}catch(Exception e) {
				System.out.println("excption is cught");
			}
			
		

	
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	}
