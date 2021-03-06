package menu;

import java.util.ArrayList;
import java.util.Collections;

public class LogedOptions {

	private ArrayList<String> options;
	
	public LogedOptions () {
		
		options = new ArrayList<String>();
		Collections.addAll(options, "Logout", "Profile", "Studies", "Accommodation", "Leisure", "WalesCard", "Bar-Restaurant");
	}
	
	public void showLogedMainMenu() {
		
		System.out.println("\r" + "\t" + "Options:");
		System.out.println("-------------------");
		for(int i = 0; i < options.size(); i++) {
			System.out.println("\t" + options.get(i));
		}
	}
	
	public String getOption(String option) {
		
		return options.get(options.indexOf(option));
	}
}
