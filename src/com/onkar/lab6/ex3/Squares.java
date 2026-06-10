package com.onkar.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Squares {
	
	public static Map<Integer, Integer> getSquares(int[] nums) {
		
		Map<Integer, Integer> sqMap = new HashMap<>();
		int numsLen = nums.length; 
		
		for (int i = 0; i < numsLen; i++) {
			sqMap.put(nums[i], nums[i]*nums[i]);
		}
		
		return sqMap;
	}
	
	public static void main(String[] args) {
		int num[] = { 6, 9, 13, 17, 20 };
		
		System.out.println(Squares.getSquares(num));
		
	}
}
