package com.onkar.lab3.ex4;
import java.util.Scanner;

public class AbsoluteDiff {
	
	public static int absoluteDifferent(int num) {
		String number = String.valueOf(num);
		int len = number.length();
		
		StringBuffer str = new StringBuffer();
		
		for (int i = 0; i < len-1; i++) {
			int a = (int) number.charAt(i);
			int b = (int) number.charAt(i+1);
			int diff = a - b;
			str.append(Math.abs(diff));
		}
		
		str.append(number.charAt(len-1));
		String absDiff = str.toString();
		int ans = Integer.parseInt(absDiff);
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		System.out.println("Absolute different between consecutive digits: " + AbsoluteDiff.absoluteDifferent(num));
		
		sc.close();
		
	}
}
