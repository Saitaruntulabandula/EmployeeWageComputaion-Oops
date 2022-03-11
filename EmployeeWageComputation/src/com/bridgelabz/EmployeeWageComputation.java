package com.bridgelabz;

public class EmployeeWageComputation {
	private static final int WAGE_PER_HOUR = 20;
	protected static void dailyWageCalculation() {
		int isPresent = 1;
		int value = (int)Math.floor(Math.random()*10) % 2;
		if(value == isPresent) {
			int empHrs = 8;
			int empWage = WAGE_PER_HOUR*empHrs; 
			System.out.println("Employee is Present and the Wage is : " +empWage);
		}
		else 
			System.out.println("Employee is Absent");	
	}
}
