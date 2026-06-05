package com.onkar.lab1.ex3;

import java.util.Scanner;

public class FibonacciSeries {
	
	public int Fibonacci(int num) {
		int a = 1;
		int b = 1;
		int sum = 0;
		
		if (num == 1 || num == 2) {
			return 1;
		}
		
		for (int i = 0; i < num - 2; i++) {
			sum = a + b;
			a = b;
			b = sum;	
		}
		
		return sum;
	}
	
	public int reccursiveFibonacci(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		return reccursiveFibonacci(num - 2) + reccursiveFibonacci(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Which Value you need : ");
		int n = sc.nextInt();
		
		while (n < 1) {
			System.out.print("Which Value you need : ");
			n = sc.nextInt();
		}
		
		FibonacciSeries fib = new FibonacciSeries();
		System.out.println("Fibonacci            : " + fib.Fibonacci(n));
		System.out.println("Reccursive Fibonacci : " + fib.reccursiveFibonacci(n));
		sc.close();
	}

}
