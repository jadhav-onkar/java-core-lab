package com.onkar.lab1.ex8;

import java.util.Scanner;

public class CheckNumber {
	public boolean isPowerOfTwo(int num) {
		int n = 1;
		while (n <= num) {
			if (n == num) {
				return true;
			}
			n *= 2;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		while (num < 0) {
			System.out.print("Enter a Number: ");
			num = sc.nextInt();
		}
		
		CheckNumber number = new CheckNumber();
		System.out.println("Is number " + num + " is power of 2: " + number.isPowerOfTwo(num));
		sc.close();
	}
}
