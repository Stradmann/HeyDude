package LyraCard;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<LyraCard> cards = new ArrayList<LyraCard>();
		boolean exitWhile = false;
		boolean paySucceed = false;
		String payMethod;
		String name = "";
		CashRegister cashRegister = new CashRegister();
		
		System.out.println("What do you want to do?");
		
		while (!exitWhile) {
			
			System.out.println("Add new Lyra(C)ard\n(A)dd founds to a card\nGet (E)conomical menu\nGet (G)ourmet menu\nE(X)it");
			String answer = read.nextLine();
			
			switch (answer) {
			
			case "C":
			case "c":
				
				System.out.println("What's the name of the owner of the card?");
				name = read.nextLine();
				System.out.println("How many money want to add?");
				double manyMoney = Double.valueOf(read.nextLine());
				cards.add(new LyraCard(manyMoney, name));
				System.out.println("Congratulations!! You've been created " + name + " new LyraCard with " + manyMoney + " of credit");
				break;
				
			case "E":
			case "e":
				
				System.out.println("How do you want to pay?\n with (L)yraCard\n with (C)ash");
				payMethod = read.nextLine();
				
				switch (payMethod) {
				
				case "L":
				case "l":
					
					System.out.println("Who are you?");
					name = read.nextLine();
					LyraCard cardInUse = null;
					for (LyraCard card : cards) {
						if(card.getOwner().equals(name)) {
							cardInUse = card;
							break;
						}
					}
					if (cardInUse == null) {
						System.out.println("This owner don't have a card");
						break;
					}
					paySucceed = cashRegister.chargeCardEconomical(cardInUse);
					if(paySucceed) {
						System.out.println("Take your economical menu. Thanks. It remains " + cardInUse.getBalance() + " of credit in your card");
						break;
					}else {
						System.out.println("You don't have enoght credit in card.");
						break;
					}
					
				case "C":
				case "c":
					
					System.out.println("It costs " + cashRegister.getEconomicalPrice() + " euros. How many you give to me?");
					double cash = Double.valueOf(read.nextLine());
					double change = cashRegister.chargeEconomical(cash);
					System.out.println("This " + change + " is your change");
					break;
					
				default:
					break;
					
				}
				
				break;
				
			case "G":
			case "g":
				
				System.out.println("How do you want to pay?\n with (L)yraCard\n with (C)ash");
				payMethod = read.nextLine();
				
				switch (payMethod) {
				
				case "L":
				case "l":
					
					System.out.println("Who are you?");
					name = read.nextLine();
					LyraCard cardInUse = null;
					for (LyraCard card : cards) {
						if(card.getOwner().equals(name)) {
							cardInUse = card;
							break;
						}
					}
					if (cardInUse == null) {
						System.out.println("This owner don't have a card");
						break;
					}
					paySucceed = cashRegister.chargeCardGourmet(cardInUse);
					if(paySucceed) {
						System.out.println("Take your economical menu. Thanks. It remains " + cardInUse.getBalance() + " of credit in your card");
						break;
					}else {
						System.out.println("You don't have enoght credit in card.");
						break;
					}
					
				case "C":
				case "c":
					
					System.out.println("It costs " + cashRegister.getGourmetPrice() + " euros. How many you give to me?");
					double cash = Double.valueOf(read.nextLine());
					double change = cashRegister.chargeGourmet(cash);
					System.out.println("This " + change + " is your change");
					break;
					
				default:
					break;
				}
				
				break;
				
			case "A":
			case "a":
				
				System.out.println("Who are you?");
				name = read.nextLine();
				LyraCard cardInUse = null;
				for (LyraCard card : cards) {
					if(card.getOwner().equals(name)) {
						cardInUse = card;
						break;
					}
				}
				if (cardInUse == null) {
					System.out.println("This owner don't have a card");
					break;
				}
				System.out.println("How many you want to add to your card?");
				double amount = Double.valueOf(read.nextLine());
				cardInUse.loadMoney(amount);
				System.out.println("Your balance is now: " + cardInUse.getBalance());
				break;
				
			case "X":
			case "x":
				
				exitWhile = true;
				break;
			}
		}
		read.close();
	}
}
