package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if (score < 5000 && score >1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		} else if (score < 1000) {
//			System.out.println("Your score was less than 1000");
//		} else {
//			System.out.println("Got Here");
//		}

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		//Challenge Solution
//		boolean newGameOver = true;
//		int newScore = 10000;
//		int newLevelCompleted = 8;
//		int newBonus = 200;
//
//		if (newGameOver) {
//			int newFinalScore = newScore + (newLevelCompleted * newBonus);
//			System.out.println("Your final score was " + newFinalScore);
//		}

		gameOver = true;
		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
    }
}
