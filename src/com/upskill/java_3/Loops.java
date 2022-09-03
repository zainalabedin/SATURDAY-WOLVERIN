package com.upskill.java_3;

public class Loops {
	
/*	type of loops
 1.for loops
 2.while loop
 3.do while loop
 4.infinite loop
	
	
	
*/
	public static void main(String[] args) {
	//practiceforloop();
	//practicewhile();
	
	//practicedowhileloopsd();
	//practiceinfiniteloops();
	//practicedecrmentloop();
		practicenestedforloop();
		 multipicationtable();
	}
	
	
	public static void practiceforloop() {
		int i;
		for(i=1;i<=10;i++) {
	
		
	System.out.println("for loops number="+ i);
	
		
		
}	
		
	}
	public static void practicewhile() {
		int i=1;
		while(i<=100) {
			System.out.println("while loops number="+i);
			i++;
		}
		
	}
	public static void practicedowhileloopsd() {
		int i=1;
		do {
			System.out.println("do while loops number="+i);
			i++;
		}while(i<=100);
		}
		
	public static void practiceinfiniteloops() {
		int i;
		for(i=1;;i++) {
			System.out.println("infinite loops number="+i);
		
}
		
	}
	
	public static void practicedecrmentloop() {
		int i;
		for (i=100; i>=10;i--) {
			System.out.println("for practicedecrmentloop numer ="+i);
		
		
	}
	}
	public static void practicenestedforloop() {
		int i;
		int j;
		for(i=1;i<=10;i++) {
			for(j=1;j<10;j++) {
				System.out.println("nested for loops number="+i+":"+j);
				System.out.println("incress value of i ->" +i);
			}
		}
	}
		
		public static void multipicationtable() {
			for (int row=1; row <=10;row++) {
				for(int col=1;col<=10;col++) {
					int table = row * col ;
					System.out.print(table +" ");
					
				}
				System.out.println(" ");
			}
			
	
	}
}


























