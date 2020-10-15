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
		System.out.println("What's the name of the bird?");
		String name = Utilities.prepareStringToStore(read.nextLine());
		System.out.println("And it's latin name?");
		String latinName = Utilities.prepareStringToStore(read.nextLine());
		birds.add(new Bird(name, latinName));
	}
	
	public void addNewObservation(Scanner read) {
		System.out.println("What bird you've seen?");
		String birdName = Utilities.prepareStringToStore(read.nextLine());
		Bird bird = findBird(birdName);
		if (bird == null) {
			System.out.println("This bird is not in DataBase or not exist");
			return;
		}
		System.out.println("Who have seen it?");
		String viewer = Utilities.prepareStringToStore(read.nextLine());
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
		System.out.println("What bird do you want to print?");
		String birdName = Utilities.prepareStringToStore(read.nextLine());
		Bird bird = findBird(birdName);
		if (bird == null) {
			System.out.println("This bird is not in DataBase or not exist");
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
