package com.roshambo;

public class PlayerOne extends Player {
	private String greeting;

	public PlayerOne(String name) {
		super(name);
		
	}

	public PlayerOne(String name, String greeting) {
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
		return Roshambo.ROCK;
	}

}
