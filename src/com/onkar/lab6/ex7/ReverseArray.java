package com.onkar.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	public static List<Integer> reverseAndSort(int[] nums){
		
		int arrLen = nums.length;
		List<Integer> res = new ArrayList<>();
		
		for (int i = 0; i < arrLen; i++) {
			String num = String.valueOf(nums[i]);
			
			String revNum = new StringBuilder(num).reverse().toString();
			
			Integer n = Integer.parseInt(revNum);
			res.add(n);
		}
		
		Collections.sort(res);
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = { 50460, 20000000, 6787, 84000, 1000000 };
		
		System.out.println(ReverseArray.reverseAndSort(nums));
	}
}
