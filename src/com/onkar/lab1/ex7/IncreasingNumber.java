package com.onkar.lab1.ex7;

import java.util.Scanner;

public class IncreasingNumber {
	
	public boolean checkIncreasingNumber(int num) {
		int n = num;
		int last = n % 10;;
		int secondLast;
		
		while (n > 0) {
			n = n / 10;
			secondLast = n % 10;
			
			if (last < secondLast) {
				return false;
			}
			
			last = secondLast;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		while (num < 0) {
			System.out.print("Enter a number: ");
			num = sc.nextInt();
		}
		
		IncreasingNumber number = new IncreasingNumber();
		System.out.println("Is "+ num + " is increasing number: " + number.checkIncreasingNumber(num));
		
		sc.close();

	}

}
