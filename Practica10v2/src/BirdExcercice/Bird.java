package BirdExcercice;

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
	public void addObservation(String viewer) {
		observations.add(new Observation(viewer));
	}
	
	//GETTERS & SETTERS
	public String getName() {
		return this.name;
	}
	
	public String getLatinName() {
		return this.latinName;
	}
	
	public ArrayList<Observation> getObservations() {
		return this.observations;
	}
	
	//TOSTRING
	@Override
	public String toString () {
		return this.getName() + " (" + this.getLatinName() + ") " + this.getObservations().size() + "observations";
	}
}
