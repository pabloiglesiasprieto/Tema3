package juego;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba como parámetro una tabla unidimensional de
		 * enteros y desordene esta misma tabla, es decir, se modifica la tabla de
		 * entrada, no se devuelve una nueva tabla.
		 */
		// Declaramos la tabla unidimensional
		int tabla[];

		// Declaramos la variable que almacenará la longitud de la tabla
		int longitud;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la longitud de la tabla
		System.out.println("Introduce la longitud de la tabla");

		// Leemos entrada de teclado.
		longitud = sc.nextInt();

		// Creamos la tabla
		tabla = new int[longitud];

		// Creamos un for que irá asignando valores al array.
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = i;
		}
		// Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));

		// Llamamos a la función
		desordenar(tabla);

		// Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));

		// Cerramos Scanner.
		sc.close();
	}

	// Creamos una función que desordena el array.
	static int[] desordenar(int tabla[]) {
		// Creamos un random
		Random rnd = new Random();

		// Creamos un bucle que irá recorriendo el array.
		for (int i = tabla.length - 1; i > 0; i--) {

			// Asignamos un valor a j.
			int j = rnd.nextInt(i + 1);

			// Intercambiar array[i] con array[j]
			int temp = tabla[i];
			tabla[i] = tabla[j];
			tabla[j] = temp;
		}
		// Devolvemos la tabla.
		return tabla;
	}
}
