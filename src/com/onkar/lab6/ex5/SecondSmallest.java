package com.onkar.lab6.ex5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallest {
	
	public static int getSecondSmallest(int[] arr) {
		List<Integer> arrList = new ArrayList<>();
		
		for (int n: arr) {
			arrList.add(n);
		}
		
		Collections.sort(arrList);
		
		return arrList.get(1);
	}
	
	public static void main(String[] args) {
		int nums[] = { 4, 7, 2, 89, 56, 3, 43, 6 };
		
		System.out.println(SecondSmallest.getSecondSmallest(nums));
	}
	
}
