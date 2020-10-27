package app;

import modules.Player;
import modules.Room;
import modules.Vampire;
import utils.viewUtils;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(0, 0);
		Room room = new Room(6, 6, 2);
		
		for(Vampire vampire : room.getVampires()) {
			System.out.println(vampire + " " + vampire.getPosY() + ", " + vampire.getPosX());
		}
		viewUtils.printRoom(room, player);
	}
}
