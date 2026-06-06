package com.onkar.lab2.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static int[] removeDuplicate(int[] arr) {
		Arrays.sort(arr);
		
		int previous = arr[0];
		int currentIndex = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == previous) {
				continue;
			}
			else {
				previous = arr[i];
				int temp = arr[currentIndex];
				arr[currentIndex] = arr[i];
				arr[i] = temp;
				currentIndex += 1;
			}    
			
		}
		
		return Arrays.copyOf(arr, currentIndex);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of Array: ");
		int size = sc.nextInt();
		
		while (size < 1) {
			System.out.print("Size of Array: ");
			size = sc.nextInt();
		}
		
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("Element " + (i+1) + " : ");
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		 int array[] = RemoveDuplicates.removeDuplicate(arr);
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.println(array[i]);
		 }
		
		 sc.close();
				
	}
}
