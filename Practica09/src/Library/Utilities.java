package Library;

public class Utilities {

	public static String toTrim(String string) {
		
		return string.trim();
	}
	
	public static String toLowerCase(String string) {
		
		return string.toLowerCase();
	}
	
	public static String toUpperCase(String string) {
		
		return string.toUpperCase();
	}
	
	public static String prepareStringToStore (String string) {
		
		string = toTrim(string);
		string = toLowerCase(string);
		return string;
	}
}
