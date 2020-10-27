package modules;

public class Player {

	private char representation;
	private int posY;
	private int posX;
	
	public Player (int posY, int posX) {
		
		this.representation = '@';
		this.posY = posY;
		this.posX = posX;
	}
	
	public char getRepresentation() {
		
		return this.representation;
	}
	
	public int getPosY() {
		
		return this.posY;
	}
	
	public int getPosX() {
		
		return this.posX;
	}
	
	@Override
	public String toString() {
		
		return "" + this.representation;
	}
}
