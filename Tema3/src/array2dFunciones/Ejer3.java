package array2dFunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
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
		System.out.println("Cual será el número de columnas/filas");

		// Leemos entrada de teclado
		columnas = sc.nextInt();

		// Asignamos la cantidad de columnas a filas
		filas = columnas;

		// Creamos la tabla con las longitudes determinadas
		tabla = new int[filas][columnas];

		// Creamos un bucle que irá recorriendo los arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los indices del array.
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = rnd.nextInt(2); // Genera números aleatorios entre 0 y 1
			}
		}
		// Imprimimos si la tabla es simetrico o no con un ternario.
		System.out.println(simetric(tabla) ? "Simetrica" : "No simetrica");

		// Cerramos el Scanner.
		sc.close();
	}

	// Creamos una función booleana.
	static boolean simetric(int tabla[][]) {

		// Recorremos los array de array
		for (int i = 0; i < tabla.length; i++) {

			// Recorremos los indices del array
			for (int j = 0; j < tabla[0].length; j++) {

				// Si la tabla es asimetrica por una parte, se para la función y devolvemos
				// false.
				if (tabla[i][j] != tabla[j][i]) {
					return false;
				}
			}
		}
		// Si no se mete en el condicional ni 1 vez, significa que la tabla es
		// simétrica.
		return true;
	}
}
