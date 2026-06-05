package com.onkar.lab1.ex4;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		
		while (n < 1) {
			System.out.print("Enter Number: ");
			n = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count += 1;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
