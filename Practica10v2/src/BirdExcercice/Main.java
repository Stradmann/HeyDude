package BirdExcercice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		BirdsDB birdsDB = new BirdsDB("Bird DataBase");
		
		Menu.mainMenu(read, birdsDB);
	}
}
