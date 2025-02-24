package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
		 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
		 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
		 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
		 * más alta a la más baja).
		 */
		// Declaramos la tabla con tamaño 8
		int tabla[] = new int[8];

		// Declaramos la tabla de tamaño donde almacenaremos la tabla invertida.
		int reverseTable[] = new int[8];

		// Declaramos la variable que servirá como índice.
		int indice = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que irá recogiendo las puntuaciones de los jugadores.
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos al usuario que introduzca
			System.out.println("Introduce la puntuación del jugador " + (i + 1));

			// Le asignamos a tabla el valor del jugador 1.
			tabla[i] = sc.nextInt();

			// Creamos un bucle while que le dirá al usuario que introduzca un valor
			// comprendido entre 1000 y 2800
			while (tabla[i] < 1000 || tabla[i] > 2800) {

				// Le pedimos al usuario que introduzca un valor correcto.
				System.out.println("Introduce un valor entre 1000 y 2800");

				// Leemos entrada de teclado.
				tabla[i] = sc.nextInt();
			}

		}

		// Ordenamos en orden ascendente.
		Arrays.sort(tabla);

		// Creamos un bucle que vaya recorriendo de final a principio el array.
		for (int i = tabla.length - 1; i >= 0; i--) {

			// Para indice será la variable inicializada en 0, la cual se irá incrementando
			// asignando los valores a cada posición del array.
			reverseTable[indice] = tabla[i];

			// Incrementamos el índice.
			indice++;
		}

		// Imprimimos la tabla decreciente.
		System.out.println(Arrays.toString(reverseTable));

		// Cerramos el Scanner.
		sc.close();
	}

}
