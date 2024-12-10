package cadenas;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
		 * siguiente: el primer jugador introduce la contraseña; a continuación, el
		 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
		 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
		 * contraseña.
		 */
		// Declaramos la variable que almacenará la contraseña
		String contraseña;

		// Declaramos la variable que almacenará la suposición del usuario.
		String guess;

		// Declaramos la variable que almacenará la diferencia alfabetica.
		int diferencia;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la contraseña.
		System.out.println("¡PSSSSTTT! ¿Cual es la contraseña secreta?");

		// Leemos entrada de teclado
		contraseña = sc.nextLine();

		// Le preguntamos al segundo jugador que diga su deducción.
		System.out.println("¿Cual crees que es la contraseña?");

		// Leemos entrada de teclado
		guess = sc.nextLine();

		// Creamos un while el cual seguirá iterando mientras que el usuario no adivine
		// la contraseña
		while (!guess.equals(contraseña)) {

			// Almacenamos en la variable diferencia la diferencia alfabeticamente.
			diferencia = guess.compareTo(contraseña);

			// Si la diferencia es mayor a 0 es que es más pequeño
			if (diferencia > 0)

				// Imprimimos que el número es más pequeño.
				System.out.println("El número a adivinar es más pequeño");

			// Si la diferencia es menor a 0 es que el número es más grande.
			else if (diferencia < 0)

				// Imprimimos que el número es más grande.
				System.out.println("El número a adivinar es más grande");

			// Le pedimos al usuario que vuelva a introducir su nueva elección
			System.out.println("Cual piensas que es el número");

			// Leemos entrada de teclado
			guess = sc.nextLine();

		}
		// Imprimimos que el usuario ha adivinado la contraseña
		System.out.println("¡Ganó el segundo jugador!");
	}
}
