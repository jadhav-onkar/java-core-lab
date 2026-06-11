package com.onkar.lab4.ex3;

public abstract class MediaItem extends Item {

	private int runTime;
	
	public MediaItem(int id, String title, int copies, int runTime) {
		super(id, title, copies);
		this.runTime = runTime;
	}
	
	public int getRunTime() {
		return this.runTime;
	}
	
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Runtime: " + this.runTime + "min");
	}

}
