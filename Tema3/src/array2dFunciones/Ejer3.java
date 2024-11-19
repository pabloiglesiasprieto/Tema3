package array2dFunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Define una función que reciba una tabla bidimensional y devuelva un booleano
		 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
		 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
		 * matriz. Delfine un método main que llame a la función y muestre por pantalla
		 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
		 */
		// Declaramos la tabla.
		int tabla[][];

		// Declaramos la variable que almacenará el número de filas de la tabla
		int filas;

		// Declaramos la variable que almacenará el número de columnas de la tabla
		int columnas;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un random
		Random rnd = new Random();

		// Le preguntamos al usuario el número de columnas
		System.out.println("Cual será el número de columnas");

		// Leemos entrada de teclado
		columnas = sc.nextInt();

		// Le preguntamos al usuario el número de filas
		System.out.println("Cual será el número de filas");

		// Leemos entrada de teclado
		filas = sc.nextInt();
		while (filas < 2) {
			System.out.println("Las filas tienen que ser mayor que 2");
			filas = sc.nextInt();
		}

		// Creamos la tabla con las longitudes determinadas
		tabla = new int[filas][columnas];

		// Creamos un bucle que irá recorriendo los arrays.
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = rnd.nextInt(0, 2);
			}
		}
		System.out.println(simetric(tabla) ? "Simetrica" : "No simetrica");
	}

	static boolean simetric(int tabla[][]) {
		boolean simetric = true;
		while (simetric) {
			for (int i = 0; i < tabla.length; i++) {
				for (int j = 0; j < tabla[0].length; j++) {
					if (tabla[i][j] != tabla[j][i]) {
						simetric = false;
					}
				}

			}

		}
		return simetric;

	}
}
