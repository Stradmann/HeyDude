package modules;

public class Plane {
	
	private String planeID;
	private int capacity;
	
	public Plane(String id, int capacity) {
		
		this.planeID = id;
		this.capacity = capacity;
	}
	
	public String getPlaneID() {
		return planeID;
	}
	public void setPlaneID(String planeID) {
		this.planeID = planeID;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
