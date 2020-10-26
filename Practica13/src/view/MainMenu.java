package view;

import java.util.Scanner;

import controller.Controller;
import db.FlyDB;
import db.PlaneDB;

public class MainMenu {
	
	public static void mainMenu(Scanner read, PlaneDB planes, FlyDB flies) {
		
		boolean exitMenu = false;
		
		while(!exitMenu) {
			
			System.out.println("Que voleu fer?");
			System.out.println("(1)Afegir un avió");
			System.out.println("(2)Afergir un vol");
			System.out.println("(x)Sortir");
			String command = read.nextLine();
			
			switch(command) {
			
			case "1":
				Controller.createPlane(read, planes);
				break;
				
			case "2":
				Controller.createFly(read, planes, flies);
				break;
				
			case "x":
			case "X":
				FlyOperationsMenu.operationMenu(read, planes, flies);
			
			default:
				exitMenu = true;
				break;
			}
		}
		
		
	}
}
