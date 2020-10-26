package modules;

public class Dog extends Animal {

	boolean isVaccinated;
	
	@Override
	public void listen() {
		
		System.out.println("Yes sir... I mean ..Guau Guau!!");
	}
	
	@Override
	public void play() {
		
		super.play();
		System.out.println("A bone!! Guau!!");
		
	}
}
