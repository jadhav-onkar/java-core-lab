package com.onkar.lab3.ex2;

import java.util.Scanner;

public class MirrorString {
	
	public static String mirroImage(String s) {
		String reverse = "";
		int len = s.length();
		
		for (int i = 0; i < len; i++) {
			reverse = s.charAt(i) + reverse;
		}
		
		return (s + " | " + reverse);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.next();
		
		System.out.println("Mirror Image  : " + MirrorString.mirroImage(s));
		
		sc.close();
	}
	
}
