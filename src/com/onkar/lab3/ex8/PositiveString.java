package com.onkar.lab3.ex8;
import java.util.Scanner;

public class PositiveString {
	
	public static boolean isPositive(String s) {
		int len = s.length();
		s = s.toUpperCase();
		for (int i = 0; i < len-1; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String word = sc.next();
		
		System.out.println("is string Positive: " + PositiveString.isPositive(word));
		
		sc.close();
		
	}
}
