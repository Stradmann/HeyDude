package Bank;

import java.util.Scanner;
import java.util.ArrayList;

public class Accounts {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Account> accountsArray = new ArrayList<>();
		
		while (true) {
			boolean exit = false;
			System.out.println("Do you want to do any operation?");
			System.out.printlm("Open new (A)ccount, (D)eposit, (W)ithdraw, (T)ransfer, Get (C)redit, e(X)it");
			String operation = read.nextLine();
			
			switch (operation) {
			
			case "A":
				
				System.out.println("What's your name?");
				String name = read.nextLine();
				System.out.println("How many money do you have?")
				double initialDeposit = Double.valueOf(read.nextLine());
				
				Account newAccount = new Account(name, initialDeposit);
				accountsArray.add(newAccount);
				System.out.println("Account seccesfully created \n" + newAccount);
				
				extit = false;
				
				break;
				
			case "D":
				
				System.out.println("What's your name?");
				String owner = read.nextLine();
				int accountIndex = getAccount(accountsArray, owner);
				if (accountIndex == -1) {
					System.out.println("You don't have any account");
					exit = false;
					break;
				}
				Account account = accountsArray.get(accountIndex);
				System.out.println("How much you want to deposit?");
				double deposit = Double.valueOf(read.nextLine());
				account.deposit(deposit);
				System.out.println(account);
				
				exit = false;
				
				break;
				
			case "W":
				
				System.out.println("What's your name?");
				String owner = read.nextLine();
				int accountIndex = getAccount(accountsArray, owner);
				if (accountIndex == -1) {
					System.out.println("You don't have any account");
					exit = false;
					break;
				}
				Account account = accountsArray.get(accountIndex);
				System.out.println("How much you want to withdraw?");
				double withdraw = Double.valueOf(read.nextLine());
				
				break;
			case "T":
				break;
			case "C":
				break;
			case "X":
				break;
			default:
				break;	
			}
		}
		
		read.close();
	}
	
	public static int getAccount (ArrayList<Account> accounts, String owner) {
		
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getOwner.equals(owner)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean haveFounds (Account account, double value) {
		
		if (account.getBalance() >= value)
	}
}
