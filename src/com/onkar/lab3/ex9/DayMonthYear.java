package com.onkar.lab3.ex9;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayMonthYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in this format (dd-mm-yyyy): ");
		String yourDate = sc.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate date = LocalDate.parse(yourDate, dtf);
		LocalDate currentDate = LocalDate.now();
		
		Period period;
		if (date.isBefore(currentDate)) {
			System.out.print("Before ");
			period = Period.between(date, currentDate);
		}
		else {
			System.out.print("After ");
			period = Period.between(currentDate, date);
		}
		
		System.out.print(period.getYears() + " Years ");
		System.out.print(period.getMonths() + " Months ");
		System.out.print(period.getDays() + " Days ");
		
		sc.close();
	}
}
