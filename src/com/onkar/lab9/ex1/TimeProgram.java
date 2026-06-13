package com.onkar.lab9.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimeProgram {
	public static void main(String[] args) {
		TimeThread timeThread = new TimeThread();
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(timeThread);
		
	}
}
