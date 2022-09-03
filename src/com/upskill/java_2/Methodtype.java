package com.upskill.java_2;

import java.lang.invoke.MethodType;

public class Methodtype {

	/* 	Types of Methods
	 
		1.Void Method
		2.Static Method
		3.Return Type Method   */

public static int hourlyIncome = 75;


public static void main(String[] args) {
	
	Methodtype myObj = new Methodtype();										//Creating Class object
myObj.annualIncomeVoid();	
//calling Void method

myObj.halfannualincomevoid();

	

weeklyIncomeStatic();

//calling Static method

System.out.println("My Monthly Income = " + myObj.monthlyIncomeReturn());	//calling Return method
}

	//calling Return method

//void Method
public void annualIncomeVoid(){
int calculateAnnualIncome = hourlyIncome * 2000;
System.out.println("My Annual Income = " + calculateAnnualIncome);

}
public void tendayIncomeVoid(){
	int tendayIncome = hourlyIncome * 2000;
	System.out.println("My tenday Income = " + hourlyIncome);

	
	
}
public void halfannualincomevoid() {
	int calculateIncome=hourlyIncome *1500;
	System.out.println(" my half month = "+calculateIncome);
	
}



//static Method
public static void weeklyIncomeStatic(){
int calculateWeeklyIncome = hourlyIncome * 40;
System.out.println("My Weekly Income = " + calculateWeeklyIncome);

}


//return type Method
public int monthlyIncomeReturn(){
int calculateMonthlyIncome = hourlyIncome * 180;
return calculateMonthlyIncome;



}
}


