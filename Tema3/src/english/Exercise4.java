package english;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		 * Minesweeper. Create the game of minesweeper but using a 1-dimension array.
		 * The program will ask the user the position to reveal. If there is a sweeper
		 * in that position, the game is over. If there is not a sweeper, the program
		 * will show the clue for that position. This clue indicates how many sweepers
		 * there are around that position. The program will start with a 20-position
		 * array and it will place 6 sweepers in different positions, chosen randomly.
		 * It will also initialize the array with all the clues. Example:
		 * {0,1,*,1,1,*,*,2,*,1,0,0,0} This panel will be hidden to the player and
		 * he/she will have to guess it.
		 */
		
		char table[] = new char [20];
		
		Random random = new Random();
		
		int position;
		
		int number;
		int number3w;
		
		System.out.println(Arrays.toString(table));
		
		
		
		
		
		for (int i = 0; i < 6; i++) {
			do {
			
			position = random.nextInt(0,20);
			
			
			
			} while (table[position] == '*');
				
				table[position] = '*';
		}
		System.out.println(Arrays.toString(table));
		
		
		
		
		System.out.println("Type a position:");
		
		
		number = random.nextInt(1,3);
		
		
		
		

	}
}
