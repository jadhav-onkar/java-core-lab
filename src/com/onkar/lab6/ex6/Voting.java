package com.onkar.lab6.ex6;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Voting {
	
	public static List<Integer> votingList(Map<Integer, Integer> voteMap) {
		List<Integer> validId = new ArrayList<>();
		
		for (Map.Entry<Integer, Integer> entry: voteMap.entrySet()) {
			if (entry.getValue() > 18) {
				validId.add(entry.getKey());
			}
		}
		
		return validId;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> voteMap = new HashMap<>();
		
		voteMap.put(1,23);
		voteMap.put(2,18);
		voteMap.put(3,56);
		voteMap.put(4,49);
		voteMap.put(5,20);
		
		System.out.println(Voting.votingList(voteMap));
		
	}
}

