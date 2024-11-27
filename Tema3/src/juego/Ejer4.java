package juego;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Vamos a realizar varias operaciones básicas de ajedrez, concretamente las de
		 * las piezas Torre, Alfil, Dama y Caballo. Crea una función distinta para cada
		 * pieza. Todas las funciones van a recibir los mismos parámetros de entrada:
		 * posFila, posColumna y pieza. La pieza será de tipo char y podrá ser T de
		 * Torre, A de Alfil, D de Dama y C de Caballo. La función devolverá una tabla
		 * (que representa al tablero) marcando con una X aquellas casillas donde se
		 * puede mover dicha pieza. La posición inicial de la pieza se marcará con su
		 * letra correspondiente.
		 */
		// Creamos la tabla 8x8
		char tablero[][] = new char[8][8];

		// Creamos una variable que almacenará la posición (filas) de la pieza.
		int posFila;

		// Creamos la variable que almacenará la posición (columnas) de la pieza
		int posCol;

		// Creamos la variable que almacenará la elección del usuario.
		String eleccion;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos la posición de fila de la pieza
		System.out.println("Cual es la posición (filas de la pieza)");

		// Leemos entrada de teclado
		posFila = sc.nextInt();

		// Preguntamos la posición de columna de la pieza.
		System.out.println("Cual es la posición (Columna de la pieza)");

		// Leemos entrada de teclado
		posCol = sc.nextInt();

		// Preguntamos cual pieza va a querer mover.
		System.out.println("¿Cual pieza va a querer mover?(T, A, D, C)");

		// Leemos entrada de teclado.
		eleccion = sc.next().toUpperCase();

		// Creamos un switch
		switch (eleccion) {

		// Si la eleccion del usuario es la torre, llamamos a la función
		case "T" -> {
			torreMov(tablero, posFila, posCol);
		}
		}

		// Creamos un bucle que irá recorriendo las filas del array.
		for (int i = 0; i < tablero.length; i++) {

			// Creamos un for que irá recorriendo los elementos del array.
			for (int j = 0; j < tablero[0].length; j++) {

				// Imprimimos la tabla.
				System.out.print(tablero[i][j] + " ");

			}
			// Imprimimos un salto de página
			System.out.println();
		}

	}

	// Creamos la función que simulará el movivmiento de las torres
	static char[][] torreMov(char tablero[][], int posFila, int posCol) {

		// Colocamos en el tablero la torre
		tablero[posFila - 1][posCol - 1] = 'T';

		// Creamos un bucle que irá recorriendo los arrays
		for (int i = 0; i < tablero.length; i++) {

			// Creamos un bucle que irá recorriendo los índices del array.
			for (int j = 0; j < tablero[0].length; j++) {

				// Si, i es igual a la posición de la pieza y j no es la posición de la pieza,
				// imprimimos x (horizontal)
				if (i == posFila - 1 && j != posCol - 1)

					// Imprimimos 'x'
					tablero[i][j] = 'x';

				// Si, i es distinto de la posición de la pieza y j es la columna de la pieza,
				// imprimimos 'x' (vertical)
				if (i != posFila - 1 && j == posCol - 1)

					// Imprimimos 'x'
					tablero[i][j] = 'x';
			}
		}
		// Devolvemos el tablero
		return tablero;
	}

	// Creamos una función que represente los movimientos del caballo
	static int[][] caballoMov(int tablero[][], int posFila, int posCol) {

		// Colocamos en el tablero la torre
		tablero[posFila - 1][posCol - 1] = 'C';
		
		

		return tablero;
	}

}