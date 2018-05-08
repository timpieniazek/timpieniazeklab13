package com.roshambo;

import java.util.Scanner;

public class Validator {
	
	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.next(); // read user entry
		scan.nextLine(); // discard any other data entered on the line
		return s;
	}
	
	public static String getDOrS(Scanner scan, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.printf(prompt);
			s = scan.next(); // read user entry
			if (s.equalsIgnoreCase("d") || s.equalsIgnoreCase("dj")) {
				return "y";
			} else if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("sg")) {
				return "n";
			} else {
				System.out.print("\nInput not recognized. ");
				prompt = "(enter \"d\" or \"s\"): ";
			}
			
		}
		return s;
		
	}
	
	public static String getRPS(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.printf(prompt);
			s = sc.next(); // read user entry
			if (s.equalsIgnoreCase("rock") || s.equalsIgnoreCase("r")) {
				return "r";
			} else if (s.equalsIgnoreCase("paper") || s.equalsIgnoreCase("p")) {
				return "p";
			} else if (s.equalsIgnoreCase("scissors") || s.equalsIgnoreCase("s")) {
					return "s";
			} else {
				System.out.print("\nInput not recognized. ");
				prompt = "(enter \"r\" or \"p\" or \"s\"): ";
			}
			
		}
		return s;
		
	}

}
