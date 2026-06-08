package com.onkar.lab5.ex2;

import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Name: ");
		String fName = sc.nextLine();
		
		System.out.println("Last name : ");
		String lName = sc.nextLine();
		
		sc.close();
		
		if (fName.isEmpty() || lName.isEmpty()) {
			throw new EmptyFieldException("You must provide first and last names");
		}
		
		System.out.println(fName + " " + lName);
	}
}
