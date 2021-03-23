package Snake_ladder;

public class Snake_Ladder_Problem {

	public static void main(String[] args) {

		//variables
		final int START=0;
		final int NO_PLAY=0;
		final int LADDER=1;
		final int SNAKE=2;
		int playerPosition=0;

		//while loop to iterate till player reaches winning position 100
		while(playerPosition <= 100)
		{
			//to get dice value
			int dieValue=(int) ((Math.random() * 100) % 6)+1;
			System.out.println("player gets "+dieValue);

			//to get status of player if its no play,ladder or snake
			int playerStatus=(int) (Math.random() * 100) % 3;

			//to print player status
			if(playerStatus == 0) 
			{
				System.out.println("player is in No Play status ");
			}
			if(playerStatus == 1) 
			{
				System.out.println("player is in ladder status ");
			}
			if(playerStatus == 2) 
			{
				System.out.println("player is in snake status ");
			}

			//using switch case to check player position
			switch(playerStatus)
			{
			case 0:
				playerPosition =playerPosition;
				break;
			case 1:
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

			//checking if player position reaches 100
			if(playerPosition == 100)
			{
				System.out.println("player reaches winning position "+playerPosition);
				break;
			}
		}
	}
}
