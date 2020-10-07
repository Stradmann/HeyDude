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
			System.out.println("Open new (A)ccount, (D)eposit, (W)ithdraw, (T)ransfer, Get (C)redit, e(X)it");
			String operation = read.nextLine();
			
			String owner;
			int accountIndex;
			Account account;
			
			switch (operation) {
			
			case "A":
				
			case "a":
				
				System.out.println("What's your name?");
				String name = read.nextLine();
				System.out.println("How many money do you have?");
				double initialDeposit = Double.valueOf(read.nextLine());
				
				Account newAccount = new Account(name, initialDeposit);
				accountsArray.add(newAccount);
				System.out.println("Account seccesfully created \n" + newAccount);
				
				exit = false;
				
				break;
				
			case "D":
				
			case "d":
				
				System.out.println("What's your name?");
				owner = read.nextLine();
				accountIndex = getAccount(accountsArray, owner);
				if (accountIndex == -1) {
					System.out.println("You don't have any account");
					exit = false;
					break;
				}
				account = accountsArray.get(accountIndex);
				System.out.println("How much you want to deposit?");
				double deposit = Double.valueOf(read.nextLine());
				account.deposit(deposit);
				System.out.println(account);
				
				exit = false;
				
				break;
				
			case "W":
				
			case "w":
				
				System.out.println("What's your name?");
				owner = read.nextLine();
				accountIndex = getAccount(accountsArray, owner);
				if (accountIndex == -1) {
					System.out.println("You don't have any account");
					exit = false;
					break;
				}
				account = accountsArray.get(accountIndex);
				System.out.println("How much you want to withdraw?");
				double withdraw = Double.valueOf(read.nextLine());
				if (haveFounds(account, withdraw)) {
					account.withdrawal(withdraw);
					System.out.println(account);
				}else {
					System.out.println("You don't have enoght founds");
					System.out.println(account);
				}
				
				exit = false;
				
				break;
				
			case "T":
				
			case "t":
				
				System.out.println("What's your name?");
				owner = read.nextLine();
				accountIndex = getAccount(accountsArray, owner);
				if (accountIndex == -1) {
					System.out.println("You don't have any account");
					exit = false;
					break;
				}
				account = accountsArray.get(accountIndex);
				System.out.println("Who is the recipient?");
				String recipient = read.nextLine();
				int recipientAccountIndex = getAccount(accountsArray, recipient);
				if (recipientAccountIndex == -1) {
					System.out.println("Recipient don't have any account");
					exit = false;
					break;
				}
				Account recipientAccount = accountsArray.get(recipientAccountIndex);
				System.out.println("How much you want to transfer?");
				double transfer = Double.valueOf(read.nextLine());
				if (haveFounds(account, transfer)) {
					account.withdrawal(transfer);
					recipientAccount.deposit(transfer);
					System.out.println(account);
					System.out.println(recipientAccount);
					exit = false;
					break;
				}else {
					System.out.println("You don't have enoght founds");
					exit = false;
					break;
				}
				
			case "C":
				
			case "c":
				
				System.out.println("What's your name?");
				owner = read.nextLine();
				accountIndex = getAccount(accountsArray, owner);
				if (accountIndex == -1) {
					System.out.println("You don't have any account");
					exit = false;
					break;
				}
				account = accountsArray.get(accountIndex);
				System.out.println("How much you need?");
				double credit = Double.valueOf(read.nextLine());
				account.deposit(credit);
				System.out.println("Done! You must return it with 200% of interest. MUAHAHAHAHA!!");
				System.out.println(account);
				
				exit = false;
				
				break;
				
			case "X":				
				
			case "x":
				
				System.out.println("GoodBye");
				
				exit = true;
				
				break;
				
			default:
				
				exit = true;
				
				break;	
			}
			
			if (exit) {
				
				read.close();
				break;
			}
		}
	}
	
	public static int getAccount (ArrayList<Account> accounts, String owner) {
				
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getOwner().equals(owner)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean haveFounds (Account account, double value) {
		
		if (account.getBalance() >= value) {
			return true;
		}
		
		return false;
		
	}
}
