package com.upskill.java_3;

import com.upskill.java_2.Methodtype;

/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
-	Single Inheritance
-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
-	Multilevel Inheritance

	*/
	public class Inheritance extends Methodtype {



	public static void main(String[] args) {
		
		Inheritance myobj = new Inheritance ();
		myobj.annualIncomeVoid();
		myobj.weeklyIncomeStatic();
		
		
		myobj.halfannualincomevoid();
		myobj.hourlyIncome();
		
	}

	private void hourlyIncome() {
		// TODO Auto-generated method stub
		
	}

	
}
	
