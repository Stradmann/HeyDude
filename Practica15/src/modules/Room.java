package modules;

import java.util.ArrayList;

public class Room {
	
	private int height;
	private int length;
	private ArrayList<Vampire> vampires;
	
	public Room(int height, int length, int vampireNum) {
		
		this.height = height;
		this.length = length;
		this.vampires = new ArrayList<Vampire>();
		for (int i = 0; i < vampireNum; i++) {
			this.vampires.add(new Vampire(this.height, this.length));
		}
	}
	
	public int getHeight() {
		
		return this.height;
	}
	
	public int getLength() {
		
		return this.length;
	}
	
	public ArrayList<Vampire> getVampires(){
		
		return this.vampires;
	}
}
