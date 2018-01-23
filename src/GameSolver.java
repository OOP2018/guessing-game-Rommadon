import java.util.Random;
import java.util.Scanner;

/** 
 *  Play guessing game on the Gamesolver.
 */
public class GameSolver {

	/** play the game. */
	/**
	 * the play method plays a game using binarysearch for find solver.
	 * @param guess is number that random automatic
	 * @return answer
	 */
	public int play(NumberGame game) {
		int min = 0;
		int max = 100;
		int guess = min + (max - min)/2;
		while (!game.guess(guess)){
			if(game.getMessage().toLowerCase().contains("large")){
				max = guess - 1;
				guess = min + (max - min)/2;
			}if(game.getMessage().toLowerCase().contains("small")){
				min = guess + 1;
				guess = min + (max - min)/2;
			}
		}
		System.out.print(game.getMessage()+"\n");
		return guess;
	}

}
