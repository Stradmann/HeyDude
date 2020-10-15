package BirdExcercice;

import java.util.Scanner;

public class Menu {
	
	public static void mainMenu (Scanner read) {
		
		boolean exitMenu = false;
		while(!exitMenu) {
			System.out.println("What do you want to do?");
			System.out.println(" Add new (B)ird\n Add new (O)bservation\n S(T)atistics\n (S)how bird\n (Q)uit");
			String option = Utilities.toUpperCase(read.nextLine());
			
			switch (option) {
			
			case "B":
				break;
				
			case "O":
				break;
				
			case "T":
				break;
				
			case "S":
				break;
				
			case "Q":
			default:
				exitMenu = true;
				break;
			}
		}
	}
}
