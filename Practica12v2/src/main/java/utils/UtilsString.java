package utils;

import modules.Date;

public class UtilsString {

	public static Date convertStringToDate(String completeDate) {
		
		String[] separatedDate = completeDate.split(",");
		int day = Integer.valueOf(separatedDate[0]);
		int month = Integer.valueOf(separatedDate[1]);
		int year = Integer.valueOf(separatedDate[2]);
		
		Date date = new Date(day, month, year); 
		return date;
	}
}
