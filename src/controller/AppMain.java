package controller;

import java.util.Scanner;

import model.LaunchMode;
import view.AdminConsole;

public class AppMain {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		handleArgs(args);
	}

	private static void handleArgs(String[] args) {
		if(args.length > 1)
			showInvalidArgumentError();
		
		else if(args.length == 0)
			launchApp(LaunchMode.USER);
		
		else if(args[0].equalsIgnoreCase("admin"))
			launchApp(LaunchMode.ADMIN);
		
		else if(args[0].equalsIgnoreCase("user"))
			launchApp(LaunchMode.USER);
		
		else
			showInvalidArgumentError();
	}

	private static void showInvalidArgumentError() {
		System.err.println("Invalid launch arguments");
	}

	private static void launchApp(LaunchMode launchMode) {
		switch (launchMode) {
		case ADMIN: AdminConsole.processInputFromConsole();
		case USER: System.out.println("Coming soon....");
		}
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void disposeApp() {
		scanner.close();
		System.exit(0);
	}

}
