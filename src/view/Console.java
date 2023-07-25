package view;

import java.util.Scanner;

import controller.AppMain;

public class Console {
	public static void printDashedLine(int length) {
		for(int i=0; i<length; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void printContinuousLine(int length) {
		for(int i=0; i<length; i++) {
			System.out.print("_");
		}
		System.out.println();
	}
	
	public static void askAnyKeyPress() {
		Scanner scanner = AppMain.getScanner();
		System.out.println("\nPRESS ENTER KEY TO CONTINUE.....");
		scanner.nextLine();
	}
}
