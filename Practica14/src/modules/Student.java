package modules;

public class Student extends Person{

	int course;
	
	@Override
	public void study() {
		
		super.play();
	}
	
	@Override
	public void listen() {

		super.sleep();
	}
	
	@Override
	public void sleep() {
		
		super.study();
	}
}
