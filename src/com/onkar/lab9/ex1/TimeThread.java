package com.onkar.lab9.ex1;

public class TimeThread implements Runnable {

	@Override
	public void run() {
		int count = 0;
		
		while (true) {
			System.out.println("Timer: " + count);
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				break;
			}
			count += 10;
			System.out.println("Timer Reset: " + count);
		}
		
	}

}
