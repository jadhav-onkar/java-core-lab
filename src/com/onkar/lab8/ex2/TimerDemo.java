package com.onkar.lab8.ex2;

public class TimerDemo {
	public static void main(String[] args) {
		ResetTimer timer = new ResetTimer();
		
		Thread t = new Thread(timer);
		t.start();
	}
}
