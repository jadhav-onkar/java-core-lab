package com.onkar.lab1.ex1;
import java.util.Scanner;

public class SumOfCubes {
	
	public static int sumOfCubes(int num) {
		int n = num;
		int res = 0;
		int remainder;
		while (n > 0){
			remainder = n % 10;
			res += remainder * remainder * remainder;
			n = n / 10;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		while (num < 0){
			System.out.print("Enter a number: ");
			num = sc.nextInt();
		}
		System.out.println("Sum of Cubes  : " + SumOfCubes.sumOfCubes(num));
		sc.close();
	}
}