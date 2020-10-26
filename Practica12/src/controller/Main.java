package controller;

import java.util.Scanner;

import databases.PersonDB;
import menu.MainMenu;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		PersonDB usersDataBase = new PersonDB();
		
		MainMenu.mainMenu(read, usersDataBase);
	}
}
