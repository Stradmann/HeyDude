package BirdExcercice;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdsDB {
	
	private String name;
	private ArrayList<Bird> birds;
	
	//CONSTRUCTOR
	public BirdsDB (String name) {
		this.name = name;
		this.birds = new ArrayList<Bird>();
	}
	
	//METHODS
	public void addNewBird(Scanner read) {
		String name = Interaction.askForBirdName(read);
		String latinName = Interaction.askForBirdLatinName(read);
		birds.add(new Bird(name, latinName));
	}
	
	public void addNewObservation(Scanner read) {
		
		String birdName = Interaction.askForBirdName(read);
		Bird bird = findBird(birdName);
		String viewer = Interaction.askForViewer(read);
		if (bird == null) {
			Interaction.birdNotFound();
			return;
		}		
		bird.addObservation(viewer);
	}
	
	public Bird findBird(String birdName) {
		for(Bird bird : birds) {
			if (bird.getName().equals(birdName)) {
				return bird;
			}
		}
		return null;
	}
	
	public void printBirds() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
	
	public void printBird(Scanner read) {
		
		String birdName = Interaction.askForBirdName(read);
		Bird bird = findBird(birdName);
		if (bird == null) {
			Interaction.birdNotFound();
			return;
		}
		System.out.println(bird);
	}
	
	//GETTERS & SETTERS
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Bird> getBirdsCollection(){
		return this.birds;
	}
}
