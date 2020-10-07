package Bank;

import java.util.Scanner;
import java.util.ArrayList;

public class Accounts {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Account> accountsArray = new ArrayList<>();
		
		while (true) {
			System.out.println("Name:");
			String name = read.nextLine();
			
			if (name.equals("")) {
				break;
			}
			
			System.out.println("How many money?");
			double manyMoney = Double.valueOf(read.nextLine());
			
			accountsArray.add(new Account(name, manyMoney));
		}
		
		transfer(accountsArray);
		
		read.close();
	}
	
	public static void transfer (ArrayList<Account> accounts) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Who are you?");
		String owner = read.nextLine();
		boolean ownerExistsLikeTeruel = false;
		int ownerAccountIndex = 0;
		for(int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getOwner().equals(owner)) {
				ownerExistsLikeTeruel = true;
				ownerAccountIndex = i;
				break;
			}
		}
		String reciever = "";
		double manyMoney = 0.0;
		if (ownerExistsLikeTeruel) {
			System.out.println("How many money want to transefer?");
			manyMoney = Double.valueOf(read.nextLine());
			System.out.println("To who? (Don't worry, Doctor will not recive nothing)");
			reciever = read.nextLine();
		} else {
			read.close();
			return;
		}
		boolean recieverExistsToo = false;
		int recieverAccounIndex = 0;
		for(int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getOwner().equals(reciever)) {
				recieverExistsToo = true;
				recieverAccounIndex = i;
				break;
			}
		}
		
		if (recieverExistsToo) {
			accounts.get(ownerAccountIndex).withdrawal(manyMoney);
			accounts.get(recieverAccounIndex).deposit(manyMoney);
		}
		
		read.close();
	}
	
	public static void personalCredit  (ArrayList<Account> accounts) {			
		Scanner read = new Scanner(System.in);
		
		System.out.println("Who are you?");
		String owner = read.nextLine();
		boolean ownerExistsLikeTeruel = false;
		int ownerAccountIndex = 0;
		
		for(int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getOwner().equals(owner)) {
				ownerExistsLikeTeruel = true;
				ownerAccountIndex = i;
				break;
			}
		}
			
		System.out.println("How much you want?");
		double needed = Double.valueOf(read.nextLine());
		System.out.println("Do you really need it? (Y)es, (N)o");
		String answer = read.nextLine();
		
		if (answer.equals("Y")) {
			System.out.println("Sorry, we don't work with homless. But we can offer that credit with 250% of interest rate.");
			read.close();
			return;
		} else if (answer.equals("N")) {
			System.out.println("That's just right. Let's check it");
			if(ownerExistsLikeTeruel && accounts.get(ownerAccountIndex).getBalance() > needed) {
				accounts.get(ownerAccountIndex).deposit(needed);
			}else{
				System.out.println("Get out!");
			}
		}
		
		read.close();
	}


	public static void yourMethod () {
		
	}

}
