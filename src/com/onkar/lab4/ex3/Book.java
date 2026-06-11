package com.onkar.lab4.ex3;

public class Book extends WrittenItem{

	public Book(int id, String title, int copies, String author) {
		super(id, title, copies, author);
	}
	
	@Override
	public void print() {
		System.out.println("====Books====");
		super.print();
		System.out.println();
	}

}
