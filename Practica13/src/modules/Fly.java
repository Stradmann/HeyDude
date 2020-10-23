package modules;

public class Fly {
	
	private Plane plane;
	private String startAirport;
	private String endAirp�rt;
	
	public Fly (Plane plane, String startAirport, String endAirport) {
		
		this.plane = plane;
		this.startAirport = startAirport;
		this.endAirp�rt = endAirport;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public String getStartAirport() {
		return startAirport;
	}

	public void setStartAirport(String startAirport) {
		this.startAirport = startAirport;
	}

	public String getEndAirp�rt() {
		return endAirp�rt;
	}

	public void setEndAirp�rt(String endAirp�rt) {
		this.endAirp�rt = endAirp�rt;
	}
}
