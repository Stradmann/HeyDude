package menu;

import java.util.ArrayList;
import java.util.Collections;

public class LogedOptions {

	private ArrayList<String> options;
	
	public LogedOptions () {
		
		options = new ArrayList<String>();
		Collections.addAll(options, "Logout", "Profile", "Studies", "Accommodation", "Leisure", "WalesCard", "Bar-Restaurant");
	}
}
