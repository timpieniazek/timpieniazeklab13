package com.roshambo;

public class PlayerTwo extends Player {
	

	public PlayerTwo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
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

}
