package array2dFunciones;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba una tabla bidimensional y devuelva en otro
		 * array distinto su transposición:
		 */
		// Declaramos la tabla.
		int tabla[][];

		// Declaramos la tabla modificada
		int tablamod[][];

		// Declaramos la variable que almacenará el número de filas de la tabla
		int filas;

		// Declaramos la variable que almacenará el número de columnas de la tabla
		int columnas;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario el número de columnas
		System.out.println("Cual será el número de columnas");

		// Leemos entrada de teclado
		columnas = sc.nextInt();

		// Le preguntamos al usuario el número de filas
		System.out.println("Cual será el número de filas");

		// Leemos entrada de teclado
		filas = sc.nextInt();

		// Creamos la tabla con las longitudes determinadas
		tabla = new int[filas][columnas];
		// Imprimimos cual es la tabla original
		System.out.println("Tabla original:");

		// Creamos un bucle que irá recorriendo los Array.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los índices de los arrays.
			for (int j = 0; j < tabla[0].length; j++) {

				// Vamos asignando los valores al array.
				tabla[i][j] = tabla[0].length * i + j + 1;

				// Imprimimos el Array.
				System.out.print(tabla[i][j] + "\t");
			}
			// Imprimimos un salto de página para diferenciar los arrays.
			System.out.println();
		}
		// Llamamos la función y asignamos el resultado al array tablamod.
		tablamod = trasponer(tabla);

		// Imprimimos cual es la tabla modificada.
		System.out.println("Tabla modificada:");

		// Creamos un bucle que irá recorriendo los Arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los índices del array.
			for (int j = 0; j < tabla.length; j++) {

				// Imprimimos la tabla.
				System.out.print(tablamod[i][j] + "\t");
			}
			// Creamos un salto de página para diferenciar los arrays.
			System.out.println();
		}
	}

	// Creamos la función trasponer.
	static int[][] trasponer(int tabla[][]) {
		// Creamos el Array con las filas y columnas determinadas.
		int tablamod[][] = new int[tabla.length][tabla[0].length];

		// Creamos un bucle que irá recorriendo los arrays de la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los índices de los arrays.
			for (int j = 0; j < tabla[0].length; j++) {

				// Asignamos los valores de las filas a las columnas.
				tablamod[j][i] = tabla[i][j];
			}
		}
		// Devolvemos la tabla
		return tablamod;
	}
}
