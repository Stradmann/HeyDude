package view;

import java.util.Scanner;

import db.FlyDB;
import db.PlaneDB;

public class FlyOperationsMenu {

	public static void operationMenu(Scanner read, PlaneDB planes, FlyDB flies) {
		
		boolean exitMenu = false;
		
		while(!exitMenu) {
			
			System.out.println("Servei de vol");
			System.out.println("\r" + "----------------");
			System.out.println("Seleccioneu operació");
			System.out.println("(1)Imprimir avions");
			System.out.println("(2)Imprimir vols");
			System.out.println("(3)Imprimir avio");
			System.out.println("(x)Sortir");
			String command = read.nextLine();
			
			switch(command) {
			
			case "1":
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			case "X":
			case "x":
			default:
				break;
			}
		}
	}
}
