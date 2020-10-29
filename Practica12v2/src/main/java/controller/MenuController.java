package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MenuController {

	public static Map<String, ArrayList<String>> createMenus(String menuKey){
		
		Map<String, ArrayList<String>> menus = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> mainMenuOptions = new ArrayList<String>();
		Collections.addAll(mainMenuOptions, "Register", "Login", "Quit");
		menus.put("Main Menu", mainMenuOptions);
		
		return menus;
	}
	
	public static void showMenu(Map<String, ArrayList<String>> menuMap, String selectedMenu) {
		
		System.out.println("\t" + selectedMenu);
		System.out.println("---------------------");
		ArrayList<String> menuOptions = menuMap.get(selectedMenu);
		for(int i = 0; i < menuOptions.size(); i++) {
			System.out.println(menuOptions.get(i));
		}
	}
}
