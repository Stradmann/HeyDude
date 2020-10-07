package Bank;

public class Account {
	
	private double balance;
    private String owner;
 
    //CONSTRUCTOR
    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }
 
    //METHODS
    public void deposit(double amount) {
        balance += amount;
    }
 
    public void withdrawal(double amount) {
        balance -= amount;
    }
    
    // GETTERS AND SETTERS
    public double getBalance() {
        return balance;
    }
 
    public String getOwner() {
		return owner;
	}

    public void setOwner(String owner) {
		this.owner = owner;
	}

    public void setBalance(double balance) {
		this.balance = balance;
	}

    //TO STRING
    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }


}
