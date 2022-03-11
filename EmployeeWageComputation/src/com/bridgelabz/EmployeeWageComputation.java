package com.bridgelabz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("****Welcome to Employee Wage Computation****");
		attendanceInfo();
	}
	private static void attendanceInfo() {
		int isPresent = 1;
		int value = (int)Math.floor(Math.random()*10) % 2;
		if(value == isPresent) {
			System.out.println("Employee is Present");
		}
		else 
			System.out.println("Employee is Absent");	
	}
}
