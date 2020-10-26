package modules;

public class Cat extends Animal {

	int numberLives;
	
	@Override
	public void listen() {
		
		super.listen();
		System.out.println("..and I don't really care");
	}
	
	@Override
	public void play() {
		
		super.play();
		System.out.println("a wool ball!! Miau!");
	}
}
