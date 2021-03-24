package com.snakeladder;

public class SnakeLadderProblem {

	public static void main(String[] args) {

		int dieValue=(int) ((Math.random() * 100) % 6)+1;
		System.out.println("player gets "+dieValue);
	}
}