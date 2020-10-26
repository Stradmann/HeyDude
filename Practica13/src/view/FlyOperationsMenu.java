package view;

import java.util.Scanner;

import controller.Controller;
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
				Controller.printPlanes(planes);
				break;
				
			case "2":
				Controller.printFlies(flies);
				break;
				
			case "3":
				Controller.printPlane(read, planes);
				break;
				
			case "X":
			case "x":
			default:
				exitMenu = true;
				break;
			}
		}
	}
}
