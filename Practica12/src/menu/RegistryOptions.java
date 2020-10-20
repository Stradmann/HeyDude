package menu;

import java.util.ArrayList;
import java.util.Collections;

public class RegistryOptions {
	
	private ArrayList<String> options;
	
	public RegistryOptions() {
		
		options = new ArrayList<String>();
		Collections.addAll(options, "Cancel", "Student", "Directive");
	}
	
	public void showRegistryOptions() {
		
		System.out.println("\r" + "You want to register as:");
		for(int i = 0; i < options.size(); i++) {
			System.out.println("\t" + options.get(i));
		}
	}
	
	public String getOption(String option) {
		
		return options.get(options.indexOf(option));
	}
}
