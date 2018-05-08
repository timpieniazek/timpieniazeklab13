package com.roshambo;

/*
 * Tim Pieniazek - Lab 13
 * 05/08/2018  timpieniazek@github
 */

import java.util.Scanner;

import com.roshambo.Player.Roshambo;

public class RoshamboApp {
	
	public static int[] scorecard = new int[3];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String userChoice;
		Player opponent;
		String userInput;
		String result;
				
		System.out.println("Welcome to Rock Paper Scissors!\n");
		
		userName = Validator.getString(scan, "Please enter your name: ");
		
		// Generates Player classes for user, playerone, and playertwo
		Player user = new User(userName);
		Player p1 = new PlayerOne("Dwayne", "The Rock will Layeth the Smacketh Down all over your Candy Ass!");
		Player p2 = new PlayerTwo("Johnson");
		
		System.out.printf("%nHello, %s!", user.getName());
		System.out.println();
		
		// Prompts user to choose an opponent
		userChoice = Validator.getDOrS(scan,
				String.format("Would you like to play against %s or %s? ", p1.getName(), p2.getName()));
		
		System.out.println();
		
		if (userChoice.equalsIgnoreCase("d")) {
			opponent = p1;
		} else {
			opponent = p2;
		}
		
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			
			result = playGame(user, opponent, scan);
			System.out.println(result);
			
			System.out.println();			
			cont = Validator.getYesOrNo(scan, "Would you like to continue? (y/n): ");
			System.out.println();
		}
		System.out.println();
		System.out.printf("Wins: %s  Loses: %s  Draws: %s", scorecard[0], scorecard[1], scorecard[2]);
	}
	
	public static String playGame(Player user, Player opponent, Scanner scan) {
		if (opponent instanceof PlayerOne) {
			System.out.println(((PlayerOne) opponent).getGreeting());
			System.out.println();
		}
		
		String userInput = Validator.getRPS(scan, "Rock, Paper, or Scissors? (r/p/s): ");
		System.out.println();
		
		Roshambo oppGenRo = opponent.generateRoshambo();
		String s1 = String.format("%s: %s",user.getName(), user.generateRoshambo(userInput));
		String s2 = String.format("%s: %s",opponent.getName(), oppGenRo);
		
		System.out.println(s1);
		System.out.println(s2);
		
		if (isWin(user.generateRoshambo(userInput), oppGenRo)) {
			scorecard[0]++;
			return user.getName() + " Wins!";
		} else if (user.generateRoshambo(userInput) == oppGenRo) {
			scorecard[1]++;
			return "Draw...";
		}
		else {
			scorecard[2]++;
			return opponent.getName() + " Wins!";
		}
		
	}
	
	public static boolean isWin(Roshambo r1, Roshambo r2) {
		if (r1 == Roshambo.Rock && r2 == Roshambo.Scissors) {
			return true;
		} else if (r1 == Roshambo.Paper && r2 == Roshambo.Rock) {
			return true;
		} else if (r1 == Roshambo.Scissors && r2 == Roshambo.Paper) {
			return true;
		} else return false;
	}

}
