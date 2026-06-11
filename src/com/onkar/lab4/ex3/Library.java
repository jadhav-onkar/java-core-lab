package com.onkar.lab4.ex3;

public class Library {
	public static void main(String[] args) {
		Book b1 = new Book(1, "Rich Dad Poor Dad", 3, "O. R. Jadhav");
		b1.print();
		
		JournalPaper p1 = new JournalPaper(2, "Deep Learning", 7, "Elon Musk", 2014);
		p1.print();
		
		CD c1 = new CD(3, "Zingaat", 10, 3, "Ajay-Atul", "Party Song");
		c1.print();
		
		Video v1 = new Video(4, "Martian", 1, 154, "Chritopher Nolan", "SciFi", 2011);
		v1.print();
		
		b1.checkIn();
		b1.print();
		
		b1.checkOut();
		b1.print();
		
		p1.setCopies(10);
		p1.print();
	}
}
