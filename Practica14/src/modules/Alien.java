package modules;

import interfaces.Action;
import interfaces.HumanAction;

public class Alien implements HumanAction, Action {

	boolean isMortal;
	
	@Override
	public void listen() {
		
		System.out.println("Ancient comunication system detected");
	}

	@Override
	public void eat() {
		
		System.out.println("Come humans, I've a great surprise for you (terror music)");
	}

	@Override
	public void play() {
		
		System.out.println("This killing terrestrial game is very nice");
	}

	@Override
	public void sleep() {
		
		System.out.println("I'm in other time and space");
	}

	@Override
	public void talk() {
		
		System.out.println("Ancient comunication system activated");
	}

	@Override
	public void createPrograms() {
		
		System.out.println("@#! this not compile neither!");
	}

	@Override
	public void study() {
		
		System.out.println("There is no more secrets in univesre to study");
	}

	@Override
	public void playViolin() {
		
		System.out.println("yes... i touched the violin!");
	}

	public void levitate() {
		
		System.out.println("ammmm.... ammmm");
	}
	
	public void fly() {
		
		System.out.println("more speed!:  amm..amm..amm..");
	}
	
	public void empathize() {
		
		System.out.println("I know accurately that you don't want to be eat by me mr. Human");
	}

}
