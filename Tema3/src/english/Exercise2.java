package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		/*
		 * Write a program that allows the user to store an arithmetic sequence at an
		 * array and then the program will show it on the screen. An arithmetic sequence
		 * is a series of numbers that starts by an initial value V, and then it
		 * continues with increases of a value I.
		 */
		// Declarate a variable that will store the initial value.
		int initial_value;

		// Declarate a variable that will store the increase.
		int increase;

		// Create a table that will store the values.
		int table[] = new int[10];

		// Create a Scanner
		Scanner sc = new Scanner(System.in);

		// Ask the user the initial value.
		System.out.println("Introduce the initial value.");

		// Read the user's input.
		initial_value = sc.nextInt();

		// Ask the user the increase.
		System.out.println("Introduce the increase.");

		// Read the user's input.
		increase = sc.nextInt();

		// Create a loop that will increase i in each iteration and will work as the
		// index at the array.
		for (int i = 0; i < table.length; i++) {

			// If i is 0, we will add the initial value to the first Array's index.
			if (i == 0) {

				// Add the value to the first index.
				table[i] = initial_value;

				// If the conditional is false, it will enter the else statement.
			} else {

				// The value of the index will be the previous one + increase.
				table[i] = table[i - 1] + increase;

			}
		}

		// Print the Array.
		System.out.println(Arrays.toString(table));

		// Close the Scanner.
		sc.close();

	}
}
