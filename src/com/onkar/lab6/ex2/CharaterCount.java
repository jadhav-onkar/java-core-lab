package com.onkar.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class CharaterCount {
	
	public static Map<Character, Integer> countCharacter(char[] charArr) {
		Map<Character, Integer> charMap = new HashMap<>(); 
		int arrSize = charArr.length;
		
		for (int i = 0; i < arrSize; i++) {
			charMap.merge(charArr[i], 1, Integer::sum );
		}
		return charMap;
	}
	
	public static void main(String[] args) {
		char charArr[] = {'a', 'b','b','c','a','a','d','a','e','c','c'};
		System.out.println(CharaterCount.countCharacter(charArr));
	}
}
