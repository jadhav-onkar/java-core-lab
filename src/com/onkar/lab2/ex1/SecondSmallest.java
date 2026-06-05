//package com.onkar.lab2.ex1;
//
//import java.util.Scanner;
//
//public class SecondSmallest {
//	
//	public static int secondHighestNumber(int arr[]) {
//		int highest = arr[0];
//		int secondHighest = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > secondHighest) {
//				highest = arr[i];
//			}
//		}
//		return 0;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Length of Array: ");
//		int len = sc.nextInt();
//		
//		int arr[] = new int[len];
//		
//		for (int i = 0; i < len; i++) {
//			System.out.print("Enter number "+ (i+1) + " : ");
//			int n = sc.nextInt();
//			arr[i] = n;
//		}
//		
//		sc.close();
//	}
//}
