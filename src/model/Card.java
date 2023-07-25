package model;

public class Card {
    private long cardNumber;
    private int pin;
    private int cvv;
    private int expiryMonth;
    private int expiryYear;
    private int countIncorrectPin;
    private boolean isActive;
    private Account account;
    
    public Card(long cardNumber,int pin, int cvv, int exmonth, int exyear, boolean isActive, Account account) {
    	 this.cardNumber = cardNumber;
    	 this.cvv = cvv;
    	 this.expiryMonth = exmonth;
    	 this.expiryYear = exyear;
    	 this.pin = pin;
    	 this.isActive = isActive;
    	 this.account = account;    	 
    }

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public Account getAccount() {
		return account;
	}

	public int getCountIncorrectPin() {
		return countIncorrectPin;
	}

	public void setCountIncorrectPin(int countIncorrectPin) {
		this.countIncorrectPin = countIncorrectPin;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
    
}
