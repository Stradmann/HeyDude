package Utilities;

import java.util.Random;

public class RandomUtilities {

		public static String getSecretNumber() {
			
			Random random = new Random();
			
			int secretNum = random.nextInt(999);
			return "" + secretNum;	
		}
}
