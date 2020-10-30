package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MenuController {

	private Map<String, ArrayList<String>> menus;
	
	public MenuController() {
		
		menus = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> mainMenuOptions = new ArrayList<String>();
		Collections.addAll(mainMenuOptions, "Register", "Login", "Quit");
		menus.put("Main Menu", mainMenuOptions);
	}
	
	public void showMenu(String selectedMenu) {
		
		System.out.println("\t" + selectedMenu);
		System.out.println("---------------------");
		
		ArrayList<String> menuOptions = this.menus.get(selectedMenu);
		
		for(int i = 0; i < menuOptions.size(); i++) {
			System.out.println(menuOptions.get(i));
		}
	}
	
	public String getOption(String selectedMenu, String option) {
		
		return menus.get(selectedMenu).get(menus.get(selectedMenu).indexOf(option));
	}
}
