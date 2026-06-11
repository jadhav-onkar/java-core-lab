package com.onkar.lab8.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {
	private FileInputStream fis;
	private FileOutputStream fos;
	private final int DELAY_WRITE = 5000;
	
	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
		this.fis = fis;
		this.fos = fos;
	}
	
	@Override
	public void run() {
		try {
			int ch;
			int count = 0;
			
			while ((ch = fis.read()) != -1) {
				fos.write(ch);
				count++;
				
				if (count % 10 == 0) {
					System.out.println("10 chars copied");
					Thread.sleep(DELAY_WRITE);
				}
			}
			
			System.out.println("Complete copying.");
			fis.close();
			fos.close();
			
		}
		catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
