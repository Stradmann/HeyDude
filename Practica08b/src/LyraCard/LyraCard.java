package LyraCard;

public class LyraCard {
	
	private String owner;
	private double balance;
	
	//CONSTRUCTOR
	public LyraCard (double balance, String owner) {
		
		this.balance = balance;
		this.owner = owner;
	}
	
	//METHODS
	public void loadMoney(double amount) {
		
		this.balance += amount;
	}
	
	public boolean pay(double amount) {
		
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	//GETTERS & SETTERS
	public double getBalance() {
		
		return this.balance;
	}
	
	public String getOwner() {
		
		return this.owner;
	}
}
