package db;

import java.util.ArrayList;

import modules.Plane;

public class PlaneDB {
	
	ArrayList<Plane> planes;
	
	public PlaneDB() {
		
		planes = new ArrayList<Plane>();
	}
	
	public ArrayList<Plane> getPlanes() {
		
		return this.planes;
	}
}
