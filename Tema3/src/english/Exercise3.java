package english;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * Where is the fly? We’re trying to catch a fly. The fly will choose randomly a
		 * position in our array and we’ll have to guess the position where the fly is.
		 * The program will ask the user the position where he/she thinks the fly is. If
		 * the position is right, then the player wins and the program finishes. If it
		 * isn’t right, then it can happen two things: The fly is in a contiguous
		 * position. Then it flies to another position. The program must tell the player
		 * that it was close but the fly changed its position. The fly is not in a
		 * contiguous position, then the fly stays where it is. The program must tell
		 * the player that the fly is far away from that position. The size of the array
		 * will be 10, but it can be changed.
		 */
		// Declarate and add the initial value of the length of the array.
		int length = 10;

		// Declarate the position where the fly is.
		int position;

		// Declarate the variable that will store the user's guessing.
		int guess = 0;

		// Create the Table.
		int table[] = new int[length];

		// Create Random.
		Random rnd = new Random();

		// Set position a value between 0-9
		position = rnd.nextInt(0, 10);

		// Create Scanner.
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Where do you think the fly is?");

			// Read user's input
			guess = sc.nextInt();

			// If the user introduced a wrong value enter the loop
			while (guess < 0 || guess > table.length) {

				// Tell the user to introduce a correct value.
				System.out.println("Introduce a value between 0 and " + (length - 1));

				// Read user's input.
				guess = sc.nextInt();
			}
			if (guess <= 0) {
				if (table[guess + 1] == 1) {
					System.out.println("The fly was in a contiguous position but the flew away.");
					table[position] = 0;
					length++;
					position = rnd.nextInt(0, table.length - 1);
					table[position] = 1;
				}
			}

			if (table[guess + 1] == 1 || table[guess - 1] == 1) {

				System.out.println("The fly was in a contiguous position but the flew away.");
				table[position] = 0;
				length++;
				position = rnd.nextInt(0, table.length - 1);
				table[position] = 1;
			} else {
				System.out.println("The fly is far away.");
			}

			// The game will finish when the user guess is right.
		} while (table[guess] != 1);

		// Print that the user won.
		System.out.println("You Won!");

	}

}
