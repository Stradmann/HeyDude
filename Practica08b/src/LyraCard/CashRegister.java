package LyraCard;

public class CashRegister {
	
	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	
	private double economicalPrice;
	private double gourmetPrice;
	
	//CONSTRUCTOR
	public CashRegister() {
		
		this.cashInRegister = 1000;
		this.economicalPrice = 2.50;
		this.gourmetPrice = 4.00;
	}
	
	//METHODS
	public double chargeEconomical(double cashGiven) {
		
		if (cashGiven >= this.getEconomicalPrice()) {
			economicalSold++;
			return cashGiven - this.getEconomicalPrice();
		}
		System.out.println("Are you kidding me?");
		return cashGiven;
	}
	
	public double chargeGourmet(double cashGiven) {
		
		if (cashGiven >= this.getGourmetPrice()) {
			gourmetSold++;
			return cashGiven - this.getGourmetPrice();
		}
		System.out.println("Are you kidding me?");
		return cashGiven;
	}
	
	public boolean chargeCardEconomical(LyraCard card) {
		
		if (card.pay(this.getEconomicalPrice())) {
			economicalSold++;
			return true;
		}
		return false;
	}
	
	public boolean chargeCardGourmet(LyraCard card) {
		
		if (card.pay(this.getGourmetPrice())) {
			gourmetSold++;
			return true;
		}
		return false;
	}
	
	//GETTERS & SETTERS
	public double getEconomicalPrice() {
		
		return this.economicalPrice;
	}
	
	public void setEconomicalPrice(double newPrice) {
		
		this.economicalPrice = newPrice;
	}
	
	public double getGourmetPrice() {
		
		return this.gourmetPrice;
	}
	
	public void setGourmetPrice(double newPrice) {
		
		this.gourmetPrice = newPrice;
	}
	
	//TOSTRING
	@Override
	public String toString () {
		
		return "Cash: " + cashInRegister + " euros.\n Economical Sold: " + economicalSold + "\n Gourmet Sold: " + gourmetSold;
	}
}
