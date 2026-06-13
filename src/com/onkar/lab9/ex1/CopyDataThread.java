package com.onkar.lab9.ex1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable{
	
	private FileReader fileReader;
	private FileWriter fileWriter;
	private final int THREAD_SLEEP_TIME = 5000;
	
	public CopyDataThread(FileReader fileReader, FileWriter fileWriter) {
		this.fileReader = fileReader;
		this.fileWriter = fileWriter;
	}
	
	@Override
	public void run() {
		
		int ch;
		int count = 0;
		
		try {
			
			while ((ch = fileReader.read()) != -1) {
				fileWriter.write(ch);
				count++;
				
				if (count % 10 == 0) {
					System.out.println("10 characters copied");
					Thread.sleep(THREAD_SLEEP_TIME);
				}
			}
			
			fileWriter.flush();
			System.out.println("File copied successfully");

            fileReader.close();
            fileWriter.close();
		}
		catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
