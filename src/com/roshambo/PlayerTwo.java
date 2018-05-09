package com.roshambo;

public class PlayerTwo extends Player {
	private String greeting;
	
	public PlayerTwo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public PlayerTwo(String name, String greeting) {
		super(name);
		this.greeting = greeting;
	}

	

	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	@Override
	public Roshambo generateRoshambo() {
		int random = (int) (Math.random() * 3 + 1);
		switch (random) {
		case 1:
			return Roshambo.Rock;
		case 2:
			return Roshambo.Paper;
		case 3:
			return Roshambo.Scissors;
		default:
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "\"" + greeting + "\" - Dwayne Johnson";
	}

}
