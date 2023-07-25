package database;
import java.util.ArrayList;

import model.Account;

public class AccountsDatabase {
    
	private static ArrayList<Account> accounts = new ArrayList<>();
	
	public static ArrayList<Account> getAllRecords(){
		return accounts;
	}

	public static void addRecord(Account account) {
		accounts.add(account);
		
	}

	public static Account getRecordByAccountNumber(long accountNumber) {
		for(Account account: accounts) {
			if(account.getAccountNumber() == accountNumber)
				return account;
		}
		return null;
	}

}
