package com.roshambo;

public class User extends Player {
		
	public User(String name) {
		super(name);
	}

	
	@Override
	public Roshambo generateRoshambo(String userInput) {
		switch (userInput) {
		case "r":
			return Roshambo.Rock;
		case "p":
			return Roshambo.Paper;
		case "s":
			return Roshambo.Scissors;
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
