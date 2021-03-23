package Snake_ladder;

public class Snake_Ladder_Problem {

	public static void main(String[] args) {

		//variables
		final int START=0;
		final int NO_PLAY=0;
		final int LADDER=1;
		final int SNAKE=2;
		int player1Position=0;
		int player2Position=0;
		int diceRollCount=0;
		int diceRollCount2nd=0;

		//iterating while loop till either 1st player or 2nd player reaches winning position
		while(player1Position <= 100 && player2Position <= 100)
		{
			//to get dice value
			int dieValue=(int) ((Math.random() * 100) % 6)+1;
			diceRollCount++;


			//to get status of player if its no play,ladder or snake
			int player1Status=(int) (Math.random() * 100) % 3;

			//checking 1st player status if its NO_PLAY,LADDER or SNAKE
			switch(player1Status)
			{
			case NO_PLAY:
				player1Position +=0;
				break;
			case LADDER:
				//if 1st player gets LADDER status will get one more chance to roll a dice
				player1Position +=dieValue;
				if(player1Position > 100)
				{
					player1Position -=dieValue;
				}
				//iterating while loop till 1st player status is NO_PLAY or SNAKE
				while(player1Status == 1)
				{
					player1Status=(int) (Math.random() *100)%3;
					if(player1Status == 1)
					{
						dieValue=(int) ((Math.random() *100)%6)+1;
						player1Position +=dieValue;
						diceRollCount++;
						if(player1Position > 100)
						{
							player1Position -=dieValue;
						}
						if(player1Position ==100)
						{
							break;
						}
					}
					if(player1Status == 2)
					{
						dieValue=(int) ((Math.random() *100)%6)+1;
						player1Position -=dieValue;
						diceRollCount++;
						break;
					}
				}

				break;
			default:
				player1Position -=dieValue;
				break;
			}

			System.out.println("1st player position is "+player1Position);

			//checking if 1st player position less than 0
			if(player1Position < 0)
			{
				player1Position =0;
				System.out.println("1st player position is "+player1Position);
			}

			//checking if 1st player position exceeds the limit 100
			if(player1Position > 100)
			{
				player1Position -=dieValue;
				System.out.println("player goes to its previous position "+player1Position);
			}

			//checking if 1st player position reaches exact limit of 100
			if(player1Position == 100)
			{
				System.out.println("1st player reaches winning position "+player1Position);
				System.out.println("total number of times dice rolled by 1st player "+diceRollCount);
				break;
			}

			//for 2nd player
			//to get 2nd dice value
			int die2Value=(int) ((Math.random() * 100) % 6)+1;
			diceRollCount2nd++;


			//to get status of 2nd player if its NO_PLAY,LADDER or SNAKE
			int player2Status=(int) (Math.random() * 100) % 3;

			//checking for 2nd player status
			switch(player2Status)
			{
			case NO_PLAY:
				player2Position +=0;
				break;
			case LADDER:
				// if 2nd player gets LADDER status will again get chance to roll a dice 
				player2Position +=die2Value;
				if(player2Position > 100)
				{
					player2Position -=die2Value;
				}
				//iterating while loop till 2nd player gets NO_PLAY or SNAKE status
				while(player2Status == 1)
				{
					player2Status=(int) (Math.random() *100)%3;
					if(player2Status == 1)
					{
						die2Value=(int) ((Math.random() *100)%6)+1;
						player2Position +=die2Value;
						diceRollCount2nd++;
						if(player2Position > 100)
						{
							player2Position -=die2Value;
						}
						if(player2Position ==100)
						{
							break;
						}
					}
					if(player2Status == 2)
					{
						die2Value=(int) ((Math.random() *100)%6)+1;
						player2Position -=die2Value;
						diceRollCount2nd++;
						break;
					}
				}
				break;

			default:
				player2Position -=die2Value;
				break;
			}

			System.out.println("2nd player position is "+player2Position);

			//checking if 2nd player position less than 0
			if(player2Position < 0)
			{
				player2Position =0;
				System.out.println("2nd player position is "+player2Position);
			}

			//checking if 2nd player position increases limit
			if(player2Position > 100)
			{
				player2Position -=die2Value;
				System.out.println("2nd player goes to its previous position "+player2Position);
			}

			//checking if 2nd player reaches exact 100th position
			if(player2Position == 100)
			{
				System.out.println("2nd player reaches winning position "+player2Position);
				System.out.println("total number of times dice rolled by 2nd player "+diceRollCount2nd);
				break;
			}

		}

	}
}
