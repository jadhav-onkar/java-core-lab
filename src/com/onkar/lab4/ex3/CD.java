package com.onkar.lab4.ex3;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;

	public CD(int id, String title, int copies, int runTime, String artist, String genre) {
		super(id, title, copies, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	
	
    @Override
    public void print() {
        System.out.println("====CD====");
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

	
}
