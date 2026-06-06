package com.onkar.lab2.ex3;

import java.util.Scanner;

public class ReverseIntegerArr {
	
	public static int[] ReverseNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String s = String.valueOf(arr[i]);
			
			String rev = "";
			
			for (int j = 0; j < s.length(); j++) {
				rev = s.charAt(j) + rev;
			}
			
			arr[i] = Integer.parseInt(rev);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		
		while (size < 1) {
			System.out.print("Enter size of Array: ");
			size = sc.nextInt();
		}
		
		int numbers[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Number " + (i + 1) + " : ");
			int n = sc.nextInt();
			numbers[i] = n;
		}
		
		int arr[] = ReverseIntegerArr.ReverseNumbers(numbers);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
