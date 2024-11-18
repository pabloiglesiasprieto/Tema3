package funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos entre 2 hasta fin
		 * inclusive.
		 */
		// Creamos la variable que almacenará la longitud de la tabla.
		int longitud;

		// Creamos la variable que almacenará el fin de los valores.
		int fin;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la longitud del array.
		System.out.println("Introduce la longitud de array");

		// Leemos entrada de teclado.
		longitud = sc.nextInt();

		// Le preguntamos al usuario el fin del array.
		System.out.println("Introduce el fin del array");

		// Leemos entrada de teclado.
		fin = sc.nextInt();

		// Enviamos los valores a la función.
		rellenaPares(longitud, fin);

	}

	// Creamos función que creará la tabla ordenada con valores hasta fin y la
	// longitud correspondiente.
	static int[] rellenaPares(int longitud, int fin) {
		// Creamos un Random
		Random rnd = new Random();

		// Creamos la tabla con la longitud determinada.
		int tabla[] = new int[longitud];

		// For que irá asignando valores.
		for (int i = 0; i < tabla.length; i++) {

			// Generamos numeros aleatorios hasta fin.
			tabla[i] = rnd.nextInt(2, fin) + 1;

			// Si el valor no es par, entrará en el condicional.
			if (tabla[i] % 2 != 0) {

				// Le restamos a i el valor 1 para que vuelva a asignarse el valor nuevamente
				// hasta que sea par.
				i -= 1;
			}
		}
		// Ordenamos la tabla.
		Arrays.sort(tabla);

		// Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));

		// Devolvemos la tabla.
		return tabla;
	}

}
