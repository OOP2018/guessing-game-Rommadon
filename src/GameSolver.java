import java.util.Random;
import java.util.Scanner;

/** 
 *  Play guessing game on the Gamesolver.
 */
public class GameSolver {

	/** play the game. */
	/**
	 * the play method plays a game using random for find solver.
	 * @param guess is number that random automatic
	 * @return answer
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		boolean correct = false ;
		long seed = System.nanoTime(); 
		Random rand = new Random(seed);
		int guess = rand.nextInt(100) + 1;
		while(!correct){
		correct = game.guess(guess);
		
//		random number from upper and lower range that message tell 
		
			if(game.getMessage().equals("Woah! Your answer is WAY too small.")){
			guess = rand.nextInt(100-guess) + guess;
			}else if(game.getMessage().equals("Sorry, too small.")){
			guess = rand.nextInt(100-guess) + guess;
			}
			if(game.getMessage().equals("No way! Your answer is WAY too large.")){
			guess = rand.nextInt(guess-1) + 1;
			}else{
			guess = rand.nextInt(guess-1) + 1;
			}
			
		}
		
		System.out.println( game.getMessage());
		return game.getSecret();
	}
	
}
