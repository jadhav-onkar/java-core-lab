package com.onkar.lab9.ex1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("from.txt");
			FileWriter fileWriter = new FileWriter("to.txt");
			
			CopyDataThread copyData = new CopyDataThread(fileReader, fileWriter);
			
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			executorService.execute(copyData);
			
		} 
		catch ( IOException e) {
			e.printStackTrace();
		}
		
	}
}
