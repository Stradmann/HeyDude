package modules;

import interfaces.Action;
import interfaces.HumanAction;

public class Person implements Action, HumanAction{

	@Override
	public void talk() {
		
		System.out.println("blablabla");
	}

	@Override
	public void createPrograms() {
		
		System.out.println("@#! this not compile!");
	}

	@Override
	public void study() {
		
		System.out.println("what's the meaning of this @#$#?!");
	}

	@Override
	public void playViolin() {
		
		System.out.println("ninoniaaaaaa...");
	}

	@Override
	public void listen() {

		System.out.println("aha,...aha");
	}

	@Override
	public void eat() {
		
		System.out.println("ñam ñam");
	}

	@Override
	public void play() {
		
		System.out.println("Yes, I win!");
	}

	@Override
	public void sleep() {
		
		System.out.println("Person is out of coverage at this moment.");
	}

}
