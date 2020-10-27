package utils;

import modules.Player;
import modules.Room;
import modules.Vampire;

public class viewUtils {
	
	public static void printRoom(Room room, Player player) {
		
		for(int i = 0; i < room.getHeight(); i++) {
			for (int j = 0; j < room.getLength(); j++) {
				if (player.getPosY() == i && player.getPosX() == j) {
					System.out.print(player);
				}else {
					for (Vampire vampire : room.getVampires()) {
						if(vampire.getPosY() == i && vampire.getPosX() == j) {
							System.out.print(vampire);
						}else {
							System.out.print("·");
						}
					}
				}
			}
			System.out.println("");
		}
	}
}
