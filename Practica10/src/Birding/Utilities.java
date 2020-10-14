package Birding;

public class Utilities {
	
	public static String toLowerCase(String string) {
		
		return string.toLowerCase();
	}
	
	public static String toTrim(String string) {
		
		return string.trim();
	}
	
	public static String prepareStringToStore (String string) {
		
		string = toTrim(string);
		string = toLowerCase(string);
		return string;
	}
}
