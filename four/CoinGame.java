import java.util.Random;

public class CoinGame
{
	private int startingCoins; // starting number of coins
	private int maxRounds; // maximum number of rounds played
	public CoinGame(int s, int r)
	{
			startingCoins = s;
			maxRounds = r;
	}
	/** Returns the number of coins (1, 2, or 3) that player 1 will spend.
		*/
	public int getPlayer1Move()
	{
			/* my dummy implementation  */
			Random rand = new Random(); //instance of random class
			int result = rand.nextInt(3) + 1;
			return result;
	}

	/** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).
		*/
	public int getPlayer2Move(int round)
	{
			int result;
			if (round % 3 == 0)
					result = 3;
			else if (round % 2 == 0)
					result = 2;
			else  result = 1;

			return result;
	}

	/** Plays a simulated game between two players, as described in part (b).
		* Both player 1 and player 2 start the game with startingCoins coins.
		* Computer player 1 spends 1, 2, or 3 coins based on the value returned by the method getPlayer1Move().
		* Computer player 2 spends 1, 2, or 3 coins based on the value returned by the method getPlayer2Move().
		*
		* The game ends when maxRounds rounds have been played or when a player’s coin count is less than 3 at the end of a round.
		*
		* At the end of the game, the winner is determined according to the following rules.
		*
		* If both players have the same number of coins at the end of the game, the method prints "tie game".
		* If player 1 has more coins than player 2, the method prints "player 1 wins".
		* If player 2 has more coins than player 1, the method prints "player 2 wins".
		*/
	public void playGame()
	{
			int p1coins = startingCoins;
			int p2coins = startingCoins;

			for(int r=1; r<=maxRounds; r++) {
					int p1move = getPlayer1Move();
					int p2move = getPlayer2Move(r);

					p1coins -= p1move;
					p2coins -= p2move;

					// Adjust number of coins
					// Use conditions of same rule, off-by-one rule, or off-by-two rule
					// Player 2 gains 1 coin if same rule or off-by-one rule applies
					// Player 1 gains 2 coins if off-by-two rule applies
					if (p1move == p2move || Math.abs(p2move - p1move) == 1) {
							p2coins += 1;
					}
					else if (Math.abs(p2move - p1move) == 2) {
							p1coins += 2;
					}

					// check end game condition
					if(p1coins < 3 || p2coins < 3) {
							break;
					}
			}

			// Display winner
			if (p1coins == p2coins)
					System.out.println("tie game");
			else if (p1coins > p2coins)
					System.out.println("player 1 wins");
			else if (p2coins > p1coins)
					System.out.println("player 2 wins");
	}
	public static void main(String[] args) {
		int coins = 10;
		int rounds = 5;
		CoinGame g = new CoinGame(coins, rounds);
		g.playGame();
	}
}