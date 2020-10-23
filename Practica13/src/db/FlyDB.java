package db;

import java.util.ArrayList;

import modules.Fly;

public class FlyDB {

	ArrayList<Fly> flies;
	
	public FlyDB() {
		
		this.flies = new ArrayList<Fly>();
	}

	public ArrayList<Fly> getFlies() {
		return flies;
	}

	public void setFlies(ArrayList<Fly> flies) {
		this.flies = flies;
	}
}
