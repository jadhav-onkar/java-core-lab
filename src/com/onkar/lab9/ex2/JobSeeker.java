package com.onkar.lab9.ex2;

import java.util.Scanner;

public class JobSeeker {
	public static boolean ValidateName(String name) {
		return name.matches(".{8,}_job");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println(ValidateName(name));
		
		sc.close();
	}
}
