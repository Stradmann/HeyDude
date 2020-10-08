package LyraCard;

public class LyraCard {
	
	private double balance;
	
	//CONSTRUCTOR
	public LyraCard (double balance) {
		
		this.balance = balance;
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
}
