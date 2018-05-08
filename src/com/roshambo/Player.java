package com.roshambo;

public abstract class Player {
	private String name;
	enum Roshambo {Rock, Paper, Scissors};
	
	
	public Player(String name) {
		super();
		this.name = name;
		}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public abstract Roshambo generateRoshambo();


	public Roshambo generateRoshambo(String userChoice) {
		// TODO Auto-generated method stub
		return null;
	}

}
