package controller;

import java.util.Scanner;

import menu.MainMenu;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		MainMenu.mainMenu(read);
	}
}
