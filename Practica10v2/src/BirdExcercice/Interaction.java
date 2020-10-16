package BirdExcercice;

import java.util.Scanner;

public class Interaction {
	
	public static String menuOptions(Scanner read) {
		System.out.println("What do you want to do?");
		System.out.println(" Add new (B)ird\n Add new (O)bservation\n S(T)atistics\n (S)how bird\n (Q)uit");
		return Utilities.toUpperCase(read.nextLine());
	}
	
	public static String askForBirdName(Scanner read) {
		System.out.println("What's the name of the bird?");
		return Utilities.prepareStringToStore(read.nextLine());
	}
	
	public static String askForBirdLatinName(Scanner read) {
		System.out.println("And it's latin name?");
		return Utilities.prepareStringToStore(read.nextLine());
	}
	
	public static String askForViewer(Scanner read) {
		System.out.println("Who have seen it?");
		return Utilities.prepareStringToStore(read.nextLine());
	}
	
	public static void birdNotFound() {
		System.out.println("This bird is not in DataBase or not exist");
	}
}
