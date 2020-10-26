package modules;

import interfaces.Action;

public class Animal implements Action{

	@Override
	public void listen() {
		
		System.out.println("are you talking to me? couse I don't understand nothing");
	}

	@Override
	public void eat() {

		System.out.println("aix!.. fodder again");
	}

	@Override
	public void play() {
		
		System.out.println("What's that?");
	}

	@Override
	public void sleep() {
		
		System.out.println("Don't disturb");
	}

}
