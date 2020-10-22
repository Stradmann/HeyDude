package Utilities;

import modules.Date;

public class DateUtils {

	public static Date createDate(String formatDate) {
		
		String[] separatedDate = formatDate.split(",");
		int day = Integer.valueOf(separatedDate[0]);
		int month = Integer.valueOf(separatedDate[1]);
		int year = Integer.valueOf(separatedDate[2]);
		
		Date date = new Date(day, month, year); 
		return date;
	}
}
