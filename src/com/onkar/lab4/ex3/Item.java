package com.onkar.lab4.ex3;

public abstract class Item {
	private int id;
	private String title;
	private int copies;
	
	public Item(int id, String title, int copies){
		this.id = id;
		this.title = title;
		this.copies = copies;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public void checkIn() {
		this.copies++;
	}
	
	public void checkOut() {
		if (this.copies <= 0) {
			System.out.println("No copies available");
		}
		else {
			this.copies--;
		}
	}
	
	public void addItem(int items) {
		this.copies += items;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || this.getClass() != obj.getClass()) return false;
		
		Item item = (Item) obj;
		
		return this.id == item.id;
	}
	
	
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("Title: " + this.title);
		System.out.println("Copies: " + this.copies);
	}
	
	@Override
	public String toString() {
		return this.id + " : " + this.title + " : " + this.copies; 
	}
	
}
