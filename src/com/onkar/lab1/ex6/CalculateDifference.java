package com.onkar.lab1.ex6;

import java.util.Scanner;

public class CalculateDifference {
	public int sumOfSquares(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i*i;
		}
		return sum;
	}
	
	public int sumOfNumbers(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum*sum;
	}
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter your Number: ");
	  int n = sc.nextInt();
	  
	  while (n < 0) {
		  System.out.print("Enter your Number: ");
		  n = sc.nextInt();
	  }
	  
	  CalculateDifference diff = new CalculateDifference();
	  System.out.println("Difference       : " + (diff.sumOfSquares(n) - diff.sumOfNumbers(n)));
	  sc.close();
	}
}
