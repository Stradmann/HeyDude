package modules;

import utils.RandomUtils;

public class Vampire {

	private char representation;
	private int posY;
	private int posX;
	
	public Vampire(int roomHeight, int roomLength) {
		
		this.representation = 'v';
		this.posY = RandomUtils.randomPosition(roomHeight);
		this.posX = RandomUtils.randomPosition(roomLength);
	}
	
	public int getPosY() {
		
		return this.posY;
	}
	
	public int getPosX() {
		
		return this.posX;
	}
	
	public char getRepresentation() {
		
		return this.representation;
	}
	
	@Override
	public String toString() {
		
		return "" + this.representation;
	}
}
