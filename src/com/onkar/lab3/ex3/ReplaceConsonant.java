package com.onkar.lab3.ex3;
import java.util.Scanner;

public class ReplaceConsonant {
	
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		
		return false;
	}
	
	public static String replaceConsonent(String s) {
		int len = s.length();
		
		for (int i = 0; i < len; i++) {
			if (ReplaceConsonant.isVowel(s.charAt(i))) {
				continue;
			}
			
			s = s.substring(0,i) + Character.toString(s.charAt(i) + 1) + s.substring(i+1); 
		}
			
		return s;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String s = sc.next();
		
		System.out.println("Replace Consonent with next letter: " + ReplaceConsonant.replaceConsonent(s));
		
		sc.close();
	}
}
