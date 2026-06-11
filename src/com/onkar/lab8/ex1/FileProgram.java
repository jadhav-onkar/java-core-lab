package com.onkar.lab8.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("from.txt");
			FileOutputStream fos = new FileOutputStream("to.txt");
			
			CopyDataThread thread = new CopyDataThread(fis, fos);
			thread.start();
		}
		catch ( IOException e) {
			e.printStackTrace();
		}
	}
}
