package BirdExcercice;

import java.util.ArrayList;

public class BirdsDB {
	
	private String name;
	private ArrayList<Bird> birds;
	
	//CONSTRUCTOR
	public BirdsDB (String name) {
		this.name = name;
		this.birds = new ArrayList<Bird>();
	}
	
	//METHODS
	
	
	//GETTERS & SETTERS
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Bird> getBirdsCollection(){
		return this.birds;
	}
}
