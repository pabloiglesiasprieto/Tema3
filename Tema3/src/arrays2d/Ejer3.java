package arrays2d;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida las dimensiones de una tabla bidimensional al
		 * usuario (número de filas y número de columnas). A continuación, crea dicha
		 * tabla bidimensional y rellénala de la siguiente forma: el elemento de la
		 * posición [i][j] debe contener el valor 10 * i + j. A continuación, muestra la
		 * tabla por consola.
		 */
		// Declaramos la tabla.
		int tabla[][];

		// Declaramos las filas
		int filas;

		// Declaramos las columnas.
		int colum;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca las filas
		System.out.println("Introduce las filas.");

		// Leemos entrada de teclado.
		filas = sc.nextInt();

		// Le pedimos al usuario que introduzca las columnas.
		System.out.println("Introduce las columnas.");

		// Leemos entrada de teclado
		colum = sc.nextInt();

		// Creamos la tabla con los datos que nos ha dado el usuario.
		tabla = new int[filas][colum];

		// Creamos un bucle que vaya recorriendo las filas.
		for (int i = 0; i < filas; i++) {

			// Creamos un bucle que vaya recorriendo las columnas.
			for (int j = 0; j < colum; j++) {

				// Asignamos el valor.
				tabla[i][j] = 10 * i + j;
			}

		}
		// Creamos un bucle que vaya recorriendo las filas.
		for (int i = 0; i < filas; i++) {

			// Creamos un bucle que vaya recorriendo las columnas.
			for (int j = 0; j < colum; j++) {

				// Imprimimos el Array.
				System.out.print(tabla[i][j] + " ");

			}
			// Salto de página para imprimir cada Array.
			System.out.println();

		}

	}
}
