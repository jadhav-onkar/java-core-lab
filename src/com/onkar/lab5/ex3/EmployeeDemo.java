package com.onkar.lab5.ex3;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salary: ");
		int salary = sc.nextInt();
		
		sc.close();
		
		if (salary < 3000) {
			throw new EmployeeException("Salary should not less that 3000");
		}
		
		Employee ganesh = new Employee();
		ganesh.setSalary(salary);
		
		System.out.println(ganesh.getSalary());
	}
}
