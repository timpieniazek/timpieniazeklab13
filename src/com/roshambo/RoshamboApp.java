package com.roshambo;

/*
 * Tim Pieniazek - Lab 13
 * 05/08/2018  timpieniazek@github
 */

import java.util.Scanner;

import com.roshambo.Player.Roshambo;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String userChoice;
		
		System.out.println("Welcome to Rock Paper Scissors!\n");
		
		userName = Validator.getString(scan, "Please enter your name: ");
		
		// Generates Player classes for user, playerone, and playertwo
		Player user = new User(userName);
		Player p1 = new PlayerOne("Dwayne Johnson", "The Rock will Layeth the Smacketh Down all over your Candy Ass!");
		Player p2 = new PlayerTwo("Space Ghost");
		
		System.out.printf("%nHello, %s!%n", user.getName());
		
		// Prompts user to choose an opponent
		userChoice = String.format("Would you like to play again %s or %s? ", p1.getName(), p2.getName());
		Validator.getDOrS(scan, userChoice);

	}
	
	public static int playGame(Player user, Player opponent) {
		
		
		
		
	}
	
	public static boolean isWin(Roshambo r1, Roshambo r2) {
		if (r1 == Roshambo.ROCK && r2 == Roshambo.SCISSORS) {
			return true;
		} else if (r1 == Roshambo.PAPER && r2 == Roshambo.ROCK) {
			return true;
		} else if (r1 == Roshambo.SCISSORS && r2 == Roshambo.PAPER) {
			return true;
		} else return false;
	}

}
