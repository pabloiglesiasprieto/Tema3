package array2dFunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Realizar una función: int[][] gira90(int tablaInicio[][]), que dada una
		 * matriz de NxN (mismo número de filas y columnas), devuelve la tablaInicio
		 * girada 90º:
		 */
		// Declaramos la tabla normal
		int tabla[][];

		// Declaramos la tabla modificada.
		int tablamod[][];

		// Declaramos la variable que almacenará las filas
		int filas;

		// Declaramos la variable que almacenará las columnas
		int columnas;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un Random
		Random rnd = new Random();

		// Preguntamos las filas
		System.out.println("Introduce el número de filas/columnas");

		// Leemos entrada de teclado
		filas = sc.nextInt();

		// Asignamosa columnas el número de filas.
		columnas = filas;

		// Creamos la tabla
		tabla = new int[filas][columnas];

		// Creamos un for que irá recorriendo los arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un for que irá recorriendo los índices del array.
			for (int j = 0; j < tabla[0].length; j++) {

				// Vamos asignando al array valores aleatorios entre 0 y 10.
				tabla[i][j] = rnd.nextInt(0, 11);

				// Imprimimos la tabla.
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		// Asignamos a tablamod el resultado de la función.
		tablamod = degrees90(tabla);

		// Imprimimos un salto de página.
		System.out.println();

		// Creamos un for que irá recorriendo los arrays.
		for (int i = 0; i < tablamod.length; i++) {

			// Creamos un for que irá recorriendo los índices del array.
			for (int j = 0; j < tablamod[0].length; j++) {

				// Imprimimos los valores de tablamod
				System.out.print(tablamod[i][j] + "\t");
			}
			// Hacemos un salto de página.
			System.out.println();
		}
	}

	// Creamos la función trasponer.
	static int[][] degrees90(int tabla[][]) {
		// Creamos el Array con las filas y columnas determinadas.
		int tablamod[][] = new int[tabla.length][tabla[0].length];

		// Creamosu n for que irá recorriendo los arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los indices de array.
			for (int j = 0; j < tabla[0].length; j++) {

				// Asignamos los valores a la tabla modificada.
				tablamod[j][tabla.length - 1 - i] = tabla[i][j];
			}
		}
		// Devolvemos la tabla.
		return tablamod;
	}
}
