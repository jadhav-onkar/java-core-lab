package com.onkar.lab4.ex3;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearRelease;
	
	public Video(int id, String title, int copies, int runTime, String director, String genre, int yearRelease) {
		super(id, title, copies, runTime);
		this.director = director;
		this.genre = genre;
		this.yearRelease = yearRelease;
	}
	
	@Override
	public void print() {
		System.out.println("====Video====");
		super.print();
		System.out.println("Director: " + this.director);
		System.out.println("Genre: " + this.genre);
		System.out.println("Year Released: " + this.yearRelease);
		System.out.println();
	}
}
