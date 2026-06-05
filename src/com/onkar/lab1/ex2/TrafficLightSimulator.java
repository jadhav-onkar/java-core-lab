package com.onkar.lab1.ex2;

import java.util.Scanner;

public class TrafficLightSimulator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Red    : 1");
		System.out.println("Yellow : 2");
		System.out.println("Green  : 3");
		System.out.print("Select Light: ");
		int light = sc.nextInt();
		
		while (light > 3 || light < 0) {
			System.out.print("Select Light: ");
			light = sc.nextInt();
		}
		
		switch (light) {
			case 1: {
				System.out.println("Stop \n \n");
				break;
			}
			case 2: {
				System.out.println("Ready \n \n");
				break;
			}
			case 3: {
				System.out.println("Go \n \n");
			}
		}
		sc.close();
		
	}
}
