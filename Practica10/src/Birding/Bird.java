package Birding;

import java.util.ArrayList;

public class Bird {
	
	private String name;
	private String latinName;
	private ArrayList<Observation> observations;
	
	//CONSTRUCTOR
	
	public Bird (String name, String latinName) {
		
		this.name = name;
		this.latinName = latinName;
		this.observations = new ArrayList<Observation>();
	}
	
	//METHODS
	
	public void addObservation(String observer) {
		
		this.observations.add(new Observation(observer));
	}
	
	public int getObservations() {
		
		return this.observations.size();
	}
	
	//GETTERS & SETTERS
	
	public String getName() {
		
		return this.name;
	}
	
	public String getLatinName() {
		
		return this.latinName;
	}
	
	//TOSTRING
	
	@Override
	public String toString () {
		
		return this.getName() + " (" + this.getLatinName() + ") " + this.getObservations() + " observations";
	}
}
