package com.javaexamples;

public class CricketScorer {
	
	private int score;
	
	public CricketScorer () {
	}
	
	public CricketScorer (int score) {
		this.score = score;
	}
	
	public int getScore () {
		return score;
	}
	
	public void addScore(int score) {
		this.score += score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketScorer cs1 = new CricketScorer();
		CricketScorer cs2 = new CricketScorer(20);
		
		cs1.addScore(5);
		cs1.addScore(10);
		cs2.addScore(2);
		cs2.addScore(15);
		
		System.out.println("Cricket Score1 is " + cs1.getScore());
		System.out.println("Cricket Score2 is " + cs2.getScore());

	}

}
