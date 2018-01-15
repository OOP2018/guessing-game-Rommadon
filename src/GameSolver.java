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
		Scanner console = new Scanner(System.in);
		boolean correct = false;
		int guess =0,min=0,max=100;

		while(!correct) {
			correct = game.guess(guess);
			guess = min+(max-min)/2;
			if(game.getSecret()>guess) {
				min=guess;
			}else {
				max=guess;
			}
		}

		System.out.println( game.getMessage());
		return game.getSecret();
	}

}
