package com.onkar.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	public static Map<Integer, String> getStudents(Map<Integer, Integer> markMap){
		Map<Integer, String> gradeMap = new HashMap<>();
		
		for (Map.Entry<Integer, Integer> entry: markMap.entrySet()) {
			if (entry.getValue() >= 90) {
				gradeMap.put(entry.getKey(), "Gold");
			}
			else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				gradeMap.put(entry.getKey(), "Silver");
			}
			else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				gradeMap.put(entry.getKey(), "Bronze");
			}
		}
		
		return gradeMap;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> markMap = new HashMap<>();
		
		markMap.put(1, 85);
		markMap.put(2, 99);
		markMap.put(3, 71);
		
		System.out.println(Student.getStudents(markMap));
		
	}
}
