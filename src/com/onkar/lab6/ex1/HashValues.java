package com.onkar.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashValues {
	
	public static List<Integer> getValues(Map<String, Integer> map) {
		
		List<Integer> vals = new ArrayList<>(map.values());
		
		Collections.sort(vals);
		return vals;
	} 
	
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); 
		
		map.put("Apple", 40);
        map.put("Banana", 20);
        map.put("Orange", 30);
        
        System.out.println(HashValues.getValues(map));
	}
}
