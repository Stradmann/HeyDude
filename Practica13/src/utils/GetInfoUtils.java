package utils;

import java.util.Scanner;

public class GetInfoUtils {
	
	public static String askForPlaneID(Scanner read) {
		System.out.println("Doneu un avi�:");
		return read.nextLine();
	}
	
	public static int askForPlaneCapacity(Scanner read) {
		System.out.println("Doneu la capacitat de l'avi�:");
		return Integer.valueOf(read.nextLine());
	}
	
	public static String askForStartAirport(Scanner read) {
		System.out.println("Indiqueu el codi de sortida de l'aeroport:");
		return read.nextLine();
	}
	
	public static String askForEndAirport(Scanner read) {
		System.out.println("Indiqueu el codi de l'aeroport de destinaci�:");
		return read.nextLine();
	}
}
