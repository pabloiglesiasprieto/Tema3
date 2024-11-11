package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		/*
		 * Write a program that creates an array to store 10 integer numbers. Then, it
		 * must show the next menu: a. Show values. b. Introduce a value. c. Exit.
		 */
		// Create the table that will store the 10 integer numbers
		int table[] = new int[10];

		// Create a String variable that will store the user's choise.
		String choice;

		// Create a variable that will store the index where the user wants to put a
		// number.
		int index;

		// Create a variable that will store a value.
		int value;

		// Create a Scanner.
		Scanner sc = new Scanner(System.in);

		// We create a do-while that will continously ask the user which thing he wants
		// to do.
		do {

			// Print the menu to the user.
			System.out.println("Select:\n A. Show Values\n B. Introduce a value \n C. Exit");

			// Read the user's input.
			choice = sc.next().toUpperCase();

			// Create a switch.
			switch (choice) {

			// If the choice value is "A", the array will be printed.
			case "A":

				// The Array will be printed.
				System.out.println(Arrays.toString(table));

				// Break the case.
				break;

			// If the choice value is "B", the program will ask the user in which index he
			// wants to store the value.
			case "B":

				// Print the question.
				System.out.println("In which index do you want to put a number (From 0-9)");

				// Read the user's input.
				index = sc.nextInt();

				// Create another loop that will tell the user to add a correct number.
				while (index < 0 || index > 9) {

					// Tell the user to print a correct value.
					System.out.println("Introduce a correct value (From 0-9)");

					// Read the user's input.
					index = sc.nextInt();

				}

				// Ask the user which value he wants to store
				System.out.println("Introduce the value you want to store");

				// Read the user's input
				value = sc.nextInt();

				// Add the value to the Array.
				table[index] = value;

				// Break the case.
				break;
			}

			// Create a loop that will continously ask the user what he wants to do, the
			// loop will end when the user types "C".
		} while (!choice.equals("C"));

		// Print that the user left the loop.
		System.out.println("Loop exit");

		// Close the Scanner.
		sc.close();
	}
}
