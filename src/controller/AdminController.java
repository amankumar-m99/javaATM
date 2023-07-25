package controller;

import java.util.ArrayList;
import java.util.Scanner;

import database.AccountsDatabase;
import database.CardsDatabase;
import model.Account;
import model.Card;
import view.Console;

public class AdminController {
	
	public AdminController(){
	}

	public void addAccont() {
		Scanner scanner = AppMain.getScanner();
		long accountNumber;
		String accountHolderName;
		double balance;
		long mobNumber;
		Console.printContinuousLine(80);
		System.out.println("Enter Account Details ------\n");
		System.out.println("1. Enter account Number: ");
		accountNumber = scanner.nextLong();scanner.nextLine();
		System.out.println("2. Enter Account Holder Name: ");
		accountHolderName = scanner.nextLine();		
		System.out.println("3. Enter mobile number: ");
		mobNumber = scanner.nextLong();scanner.nextLine();
		balance = 20000;
		Account account = new Account(accountNumber, accountHolderName, balance, mobNumber, null);
		AccountsDatabase.addRecord(account);
	}

	public void editAccount() {
		System.out.println("This functionality is not available currently!");
	}

	public void showAllAccounts() {
		Console.printContinuousLine(80);
		ArrayList<Account> allAccounts = AccountsDatabase.getAllRecords();
		System.out.println("A/C Number | A/C Holder | Balance | Mob Number | Card Number");
		if(allAccounts.size() == 0) {
			System.out.println("\n\nNo records to display\n\n");
			Console.printDashedLine(100);
			return;
		}
		for(Account account: allAccounts) {
			System.out.print(account.getAccountNumber()+ " | ");
			System.out.print(account.getAccountHolderName()+ " | ");
			System.out.print(account.getBalance()+ " | ");
			System.out.print(account.getMobNumber()+ " | ");
			Card card = account.getCard();
			if(card != null)
				System.out.println(card.getCardNumber());
			else
				System.out.println(" N/A");
		}
		Console.printDashedLine(100);
	}

	public void addCard() {
		Scanner scanner = AppMain.getScanner();
		long accountNumber;
		Account account;
		Console.printContinuousLine(80);
		System.out.println("Enter Account Details for Card ------\n");
		System.out.println("1. Enter account Number to be linked with the card: ");
		accountNumber = scanner.nextLong();
		account = AccountsDatabase.getRecordByAccountNumber(accountNumber);
		if(account == null) {
			System.out.println("No such account exists!");
			return;
		}
		CardsDatabase.addRecord(generateCard(account));
		AccountsDatabase.addRecord(account);
	}

	private Card generateCard(Account account) {
		Card card = CardsDatabase.getLastRecord();
		long cardNumber = 12345678;
		if(card != null)
			cardNumber = card.getCardNumber()+1;
		int pin = 1234;
		int cvv = 999;
		int expiryMonth = 12;
		int expiryYear = 2025;
		boolean isActive = true;
		return new Card(cardNumber,pin,cvv,expiryMonth, expiryYear,isActive,account);
	}

	public void editCard() {
		System.out.println("This functionality is not available currently!");
	}

	public void showAllCards() {
		Console.printContinuousLine(80);
		ArrayList<Card> allCards = CardsDatabase.getAllRecords();
		System.out.println("Card Number | PIN | CVV| Expiry Month | Expiry Year | Active | Incorrect Attempts | Account Number");
		if(allCards.size() == 0) {
			System.out.println("\n\nNo records to display\n\n");
			Console.printDashedLine(100);
			return;
		}
		for(Card card: allCards) {
			System.out.print(card.getCardNumber()+ " | ");
			System.out.print(card.getPin()+ " | ");
			System.out.print(card.getCvv()+ " | ");
			System.out.print(card.getExpiryMonth()+ " | ");
			System.out.print(card.getExpiryYear()+ " | ");
			System.out.print(card.isActive()+ " | ");
			System.out.print(card.getCountIncorrectPin()+ " | ");
			Account account = card.getAccount();
			if(account != null)
				System.out.println(account.getAccountNumber());
			else
				System.out.println(" N/A");
		}
		Console.printDashedLine(100);
	}

	public void showCompleteDatabase() {
		System.out.println("This functionality is not available currently!");
	}

}
