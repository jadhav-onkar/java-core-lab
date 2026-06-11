package com.onkar.lab4.ex3;

public class JournalPaper extends WrittenItem{

	private int yearPublished;
	
	public JournalPaper(int id, String title, int copies, String author, int yearPublished) {
		super(id, title, copies, author);
		this.yearPublished = yearPublished;
	}
	
	 @Override
    public void print() {
        System.out.println("====Journal Paper====");
        super.print();
        System.out.println("Year Published: " + yearPublished);
        System.out.println();
    }

}
