package app;

import java.util.Scanner;

import db.FlyDB;
import db.PlaneDB;
import view.MainMenu;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		PlaneDB planes = new PlaneDB();
		FlyDB flies = new FlyDB();
		
		MainMenu.mainMenu(read, planes, flies);
	}
}
