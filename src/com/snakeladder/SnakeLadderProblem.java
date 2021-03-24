package com.snakeladder;

public class SnakeLadderProblem {

	public static void main(String[] args) {

		//variables
		final int START=0;
		final int NO_PLAY=0;
		final int LADDER=1;
		final int SNAKE=2;
		int playerPosition=0;

		//using random function to get dice value
		int dieValue=(int) ((Math.random() * 100) % 6)+1;
		System.out.println("player gets "+dieValue);

		//using random function to get status of player if its no play,ladder or snake
		int playerStatus=(int) (Math.random() * 100) % 3;

		//to print player status
		if(playerStatus == NO_PLAY) 
		{
			System.out.println("player is in No Play status ");
		}
		if(playerStatus == LADDER) 
		{
			System.out.println("player is in ladder status ");
		}
		if(playerStatus == SNAKE) 
		{
			System.out.println("player is in snake status ");
		}

		//checking player position
		switch(playerStatus)
		{
		case NO_PLAY:
			playerPosition =playerPosition;
			break;
		case LADDER:
			playerPosition +=dieValue;
			break;
		default:
			playerPosition -=dieValue;
			break;
		}
		System.out.println("player position is "+playerPosition);
	}

}
