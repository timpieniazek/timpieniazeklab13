package com.roshambo;

public abstract class Player {
	private String name;
	private String greeting;
	enum Roshambo {ROCK, PAPER, SCISSORS};
	
	
	public Player(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public abstract Roshambo generateRoshambo();

}
