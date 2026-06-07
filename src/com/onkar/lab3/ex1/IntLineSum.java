package com.onkar.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntLineSum {
	
	public static boolean checkTokenNumeric(String token) {
		char tokens[] = token.toCharArray();
		for (char c: tokens) {
			if (Character.isLetter(c)) {
				return false;
			}
			else {
				continue;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter line of integers seperated by space: ");
		String numLine = sc.nextLine();
		
		StringTokenizer nums = new StringTokenizer(numLine, " ");
		
		int tokens = nums.countTokens();		
		int sum = 0;
		
		for (int i = 0; i < tokens; i++) {
			String token = nums.nextToken();
			
			if (!IntLineSum.checkTokenNumeric(token)) {
				continue;
			}
			else {
				int num = Integer.parseInt(token);
				sum += num;
			}
		}
		
		System.out.println("Sum of Integers: " + sum);
		
		sc.close();
	}
}
