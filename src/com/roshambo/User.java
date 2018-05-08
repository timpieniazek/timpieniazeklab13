package com.roshambo;

public class User extends Player {private
		
	public User(String name) {
		super(name);
	}

	
	@Override
	public Roshambo generateRoshambo(String userChoice) {
		switch (userChoice) {
		case "r":
			return Roshambo.ROCK;
		case "p":
			return Roshambo.PAPER;
		case "s":
			return Roshambo.SCISSORS;
			default:
				return null;
				
		}
	}


	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}

}
