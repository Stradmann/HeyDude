package apartmentComparison;

public class Apartment {
	
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;
	
	//CONSTRUCTOR
	public Apartment (int rooms, int squareMeters, int pricePerSquareMeter) {
		
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}
	
	//METHODS
	public boolean larger(Apartment otherApartment) {
		
		if (this.getSquareMeters() > otherApartment.getSquareMeters()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int priceDifference(Apartment otherApartment) {
		
		return this.absolutPrice() - otherApartment.absolutPrice();
		
	}
	
	public boolean moreExpensiveThan(Apartment otherApartment) {
		
		if (priceDifference(otherApartment) > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int absolutPrice () {
		return this.getPricePerSquareMeter() * this.getSquareMeters();
	}
	
	//GETTERA & SETTERS
	public int getRooms() {
		return this.rooms;
	}
	
	public int getSquareMeters() {
		return this.squareMeters;
	}
	
	public int getPricePerSquareMeter() {
		return this.pricePerSquareMeter;
	}
	
	public void setPricePerSquareMeter(int newValue) {
		this.pricePerSquareMeter = newValue;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		
		return "This apartment have " + this.getRooms() + "rooms, " + this.getSquareMeters() + "square meters. It costs " + this.absolutPrice() + " euros"; 
	}
}
