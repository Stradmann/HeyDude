package utils;

import java.util.Random;

public class RandomUtils {

	public static int randomPosition (int maxPosition) {
		
		Random randomizer = new Random();
		return randomizer.nextInt(maxPosition);
	}
}
