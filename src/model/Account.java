package model;

public class Account {
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	private long mobNumber;
	private Card card;
	
	public Account(long accountNumber, String accountHolderName, double balance, long mobNumber, Card card) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.mobNumber = mobNumber;
		this.card = card;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
}