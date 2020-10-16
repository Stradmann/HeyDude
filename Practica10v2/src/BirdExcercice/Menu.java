package BirdExcercice;

import java.util.Scanner;


public class Menu {
	
	public static void mainMenu (Scanner read, BirdsDB birdsDB) {
		
		boolean exitMenu = false;
		while(!exitMenu) {
			String option = Interaction.menuOptions(read);
			
			switch (option) {
			
			case "B":
				birdsDB.addNewBird(read);
				break;
				
			case "O":
				birdsDB.addNewObservation(read);
				break;
				
			case "T":
				birdsDB.printBirds();
				break;
				
			case "S":
				birdsDB.printBird(read);
				break;
				
			case "Q":
			default:
				exitMenu = true;
				break;
			}
		}
	}
}
