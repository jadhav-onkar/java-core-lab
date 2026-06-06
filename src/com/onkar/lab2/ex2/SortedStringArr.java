package com.onkar.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class SortedStringArr {
	
	public static String[] sortedString(String[] s) {
		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
		
		int len = s.length;
		int mid;
		
		if (len % 2 == 0) {
			mid = len / 2;
		}
		else {
			mid = (len / 2) + 1;
		}
		
		for (int i = 0; i < mid; i++) {
			System.out.println("Reached");
			s[i] = s[i].toUpperCase();
		}
		
		for (int j = mid; j < len; j++) {
			s[j] = s[j].toLowerCase();
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of Words: ");
		int len = sc.nextInt();
		
		while (len < 1) {
			System.out.print("Number of Words: ");
			len = sc.nextInt();
		}
		
		String names[] = new String[len];
		
		for (int i = 0; i < len; i++) {
			System.out.print("Word " + (i + 1) + " : ");
			String s = sc.next();
			names[i] = s;
		}
		
		String[] arr = SortedStringArr.sortedString(names);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		sc.close();
		
	}
}
