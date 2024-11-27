package juego;

import java.util.Arrays;
import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba como parámetro una tabla bidimensional de
		 * enteros y desordene esta misma tabla, es decir, se modifica la tabla de
		 * entrada, no se devuelve una nueva tabla.
		 */
		// Creamos la tabla.
		int tabla[][] = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 } };

		// Imprimimos la tabla
		System.out.println(Arrays.deepToString(tabla));

		// Llamamos a la función
		tabla = desordenar(tabla);

		// Imprimimos la tabla.
		System.out.println(Arrays.deepToString(tabla));

	}

	// Creamos la función que desordenará la tabla
	static int[][] desordenar(int tabla[][]) {
		// Creamos random
		Random random = new Random();

		// Creamos una variable filas que almacenará el número de filas
		int filas = tabla.length;

		// Creamos la variable columnas que almacenará las columnas
		int columnas = tabla[0].length;

		// Hacemos un bucle que asignará valores aleatorios.
		for (int i = filas - 1; i > 0; i--) {
			for (int j = columnas - 1; j > 0; j--) {
				int k = random.nextInt(i + 1);
				int l = random.nextInt(j + 1);

				// Intercambiar tabla[i][j] con tabla[k][l]
				int temp = tabla[i][j];
				tabla[i][j] = tabla[k][l];
				tabla[k][l] = temp;
			}
		}
		// Devolvemos la tabla
		return tabla;
	}
}
