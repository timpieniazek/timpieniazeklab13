package com.roshambo;

public class PlayerOne extends Player {

	public PlayerOne(String name, String greeting) {
		super(name, greeting);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
