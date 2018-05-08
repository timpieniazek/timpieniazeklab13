package com.roshambo;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		
		System.out.println("Welcome to Rock Paper Scissors!\n");
		
		userName = Validator.getString(scan, "Enter your name: ");

	}

}
