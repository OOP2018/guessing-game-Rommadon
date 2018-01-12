import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	/**
	 * the play method plays a game using input from user.
	 * @param guess is number that input by user
	 * @return answer
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		
		// describe the game
		System.out.println( game.toString() );
		
		// This is just an example.
		System.out.println( game.getMessage() );
		System.out.print("Your answer? ");
		int guess = console.nextInt();
		boolean correct = game.guess(guess);
		System.out.println( game.getMessage() );
		return game.getSecret();
	}
	
}
