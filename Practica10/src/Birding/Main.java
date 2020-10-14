package Birding;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Bird> birds = new ArrayList<Bird>();
		
		boolean exitWhile = false;
		
		while (!exitWhile) {
			System.out.println("Welcome to Birding!tm. What do you want to do?");
			System.out.println("Add a new (B)ird");
			System.out.println("Add new (O)bservation");
			System.out.println("S(T)atistics of birds");
			System.out.println("(S)how a bird");
			System.out.println("(Q)uit");
			
			String option = Utilities.toLowerCase(read.nextLine());
			
			switch (option) {
			
			case "b":
				System.out.println("Name:");
				String name = Utilities.prepareStringToStore(read.nextLine());
				System.out.println("Latin Name:");
				String latinName = Utilities.prepareStringToStore(read.nextLine());
				birds.add(new Bird(name, latinName));
				break;
				
			case "o":
				System.out.println("What was observed?");
				String birdObserved = Utilities.prepareStringToStore(read.nextLine());
				Bird observedBird = findBird(birds, birdObserved);
				if (observedBird == null) {
					System.out.println("This is not a bird!!");
					break;
				}
				System.out.println("Who was the observer?");
				String observer = Utilities.prepareStringToStore(read.nextLine());
				observedBird.addObservation(observer);
				break;
				
			case "t":
				for (Bird bird : birds) {
					System.out.println(bird);
				}
				break;
				
			case "s":
				System.out.println("What do you want to show?");
				String birdSearched = Utilities.prepareStringToStore(read.nextLine());
				Bird searchedBird = findBird(birds, birdSearched);
				if (searchedBird == null) {
					System.out.println("The bird was not found");
					break;
				}
				System.out.println(searchedBird);
				break;
				
			case "q":
			default:
				exitWhile = true;
				break;				
			}
		}
		read.close();
	}
	
	//METHODS
	
	public static Bird findBird(ArrayList<Bird> birds, String name) {
		
		for (Bird bird : birds) {
			if (bird.getName().equals(name)) {
				return bird;
			}
		}
		
		return null;
	}
}
