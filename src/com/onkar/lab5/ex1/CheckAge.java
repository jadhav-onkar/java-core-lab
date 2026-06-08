package com.onkar.lab5.ex1;

import java.util.Scanner;

public class CheckAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		
		if (age < 16) {
			throw new UserIsUnderAge("You are under age");
		}
		else {
			System.out.println("You is eligible");
		}
	}
}
