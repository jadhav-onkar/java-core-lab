package com.onkar.lab1.ex5;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public int SumOfNumbers(int n) {
		int sum = 0;
		for (int i = 3; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		while (num < 0) {
			System.out.print("Enter a Number: ");
			num = sc.nextInt();
		}
		
		SumOfNaturalNumber sum = new SumOfNaturalNumber();
		System.out.println("Sum of N natural numbers Divisible by 3 or 5: " + sum.SumOfNumbers(num));
		sc.close();
	}
}
