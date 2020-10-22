package menu;

import java.util.ArrayList;
import java.util.Collections;

public class ProfileOptions {
	
	private ArrayList<String> options;
	
	public ProfileOptions() {
		
		options = new ArrayList<String>();
		Collections.addAll(options, "Name", "Last Name", "Birthday", "Username", "Password", "Print", "Done");
	}
	
	public void showProfileOptions() {
		
		System.out.println("What do you want to change?");
		for(int i = 0; i < options.size(); i++) {
			System.out.println("\t" + options.get(i));
		}
	}
	
	public String getOption(String option) {
		
		return options.get(options.indexOf(option));
	}
}
