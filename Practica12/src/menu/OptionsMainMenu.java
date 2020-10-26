package menu;

import java.util.ArrayList;
import java.util.Collections;

public class OptionsMainMenu {
	
	private ArrayList<String> options;
	
	public OptionsMainMenu(){
		
		options = new ArrayList<String>();
		Collections.addAll(options, "Quit", "Register", "Login");
	}
	
	public void showMainMenu() {
		
		System.out.println("\r" + "Main Menu:");
		System.out.println("---------------------");
		System.out.println("Type your option (please):");
		for(int i = 0; i < options.size(); i++) {
			System.out.println("\t" + options.get(i));
		}
	}
	
	public String getOption(String option) {
		
		return options.get(options.indexOf(option));
	}
}
