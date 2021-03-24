package com.snakeladder;

public class SnakeLadderProblem {

	public static void main(String[] args) {

		//variables
		final int START=0;
		final int NO_PLAY=0;
		final int LADDER=1;
		final int SNAKE=2;
		int playerPosition=0;
		int diceRollCount=0;

		//while loop to iterate till player reaches winning position 100
		while(playerPosition <= 100)
		{
			//to get dice value
			int dieValue=(int) ((Math.random() * 100) % 6)+1;
			diceRollCount++;

			//to get status of player if its no play,ladder or snake
			int playerStatus=(int) (Math.random() * 100) % 3;

			//using switch case to check player position
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

			//checking if player position less than 0
			if(playerPosition < 0)
			{
				playerPosition =0;
				System.out.println("player position is "+playerPosition);
			}

			//checking if player exceeds its position than 100 
			if(playerPosition > 100)
			{
				playerPosition -=dieValue;
				System.out.println("player goes to its previous position "+playerPosition);
			}

			//checking if player position reaches 100
			if(playerPosition == 100)
			{
				System.out.println("player reaches winning position "+playerPosition);
				System.out.println("total number of times dice rolled is "+diceRollCount);

				break;
			}
		}
	}

}
