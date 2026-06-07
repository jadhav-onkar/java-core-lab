package com.onkar.lab3.ex5;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCount {
	
	public static int wordCount(String s) {
		StringTokenizer str = new StringTokenizer(s, " ");
		return str.countTokens();
	}
	
	public static int characterCount(String s) {
		int len = s.length();
		int charCount = 0;
		
		for (int i = 0; i < len; i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				charCount += 1;
			}
		}
		return charCount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String: ");
		String text = sc.nextLine();
		
		System.out.println("Number of Characters: " + StringCount.characterCount(text));
		System.out.println("Number of Words: " + StringCount.wordCount(text));
		
		sc.close();
	}
}
