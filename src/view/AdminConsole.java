package view;

import java.util.Scanner;

import controller.AdminController;
import controller.AppMain;

public class AdminConsole {
	
	private static AdminController adminController = new AdminController();
	
	public static void processInputFromConsole() {
		String inputMenu = getMenu();
		handleArgs(inputMenu);
		processInputFromConsole();
	}
	
	private static String getMenu() {
		showAdminMenu();
		String text="";
		Scanner scanner = AppMain.getScanner();
		if(scanner.hasNextLine()) {
			text = scanner.nextLine();
		}
		return text;
	}

	private static void showAdminMenu() {
//		System.out.print("\033[H\033[2J");
//		System.out.flush();
		Console.printContinuousLine(80);
		System.out.println("Admin Menu:");
		System.out.println("1. Add an Account");
		System.out.println("2. Edit an Account");
		System.out.println("3. Show all accounts");
		System.out.println("4. Add a Card");
		System.out.println("5. Edit a Card");
		System.out.println("6. Show all cards");
		System.out.println("7. Show complete database");
		System.out.println("8. Exit");
		Console.printDashedLine(50);
		System.out.print("Admin Mode| Input:");
	}

	private static void handleArgs(String inputText) {
		int index = -1;
		inputText = inputText.trim();
		try {
			index = Integer.parseInt(inputText);			
		}
		catch (NumberFormatException nfe) {
//			System.err.println("Invalid Menu !");
			return;
		}
		if(index < 1 || index > 8)
			return;
		switch (index) {
		case 1: addAccount(); break;
		case 2: editAccount(); break;
		case 3: showAllAccounts(); break;
		case 4: addCard(); break;
		case 5: editCard(); break;
		case 6: showAllCards(); break;
		case 7: showCompleteDatabase(); break;
		case 8: AppMain.disposeApp(); break;
		}
		Console.askAnyKeyPress();
	}

	private static void addAccount() {
		adminController.addAccont();
	}

	private static void editAccount() {
		adminController.editAccount();
	}

	private static void showAllAccounts() {
	adminController.showAllAccounts();	
	}

	private static void addCard() {
		adminController.addCard();
	}
	private static void editCard() {
		adminController.editCard();
	}
	private static void showAllCards() {
		adminController.showAllCards();
	}
	private static void showCompleteDatabase() {
		adminController.showCompleteDatabase();		
	}
}
