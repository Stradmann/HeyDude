package modules;

public class Fly {
	
	private Plane plane;
	private String startAirport;
	private String endAirpòrt;
	
	public Fly (Plane plane, String startAirport, String endAirport) {
		
		this.plane = plane;
		this.startAirport = startAirport;
		this.endAirpòrt = endAirport;
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

	public String getEndAirpòrt() {
		return endAirpòrt;
	}

	public void setEndAirpòrt(String endAirpòrt) {
		this.endAirpòrt = endAirpòrt;
	}
}
