package arrays;

import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100.
		 */
		// Creamos la tabla que almacenará los números.
		int tabla[] = new int[10];

		// Creamos random
		Random rnd = new Random();

		// Empezamos en el índice 0 y vamos recorriendo la tabla hasta alcanzar la
		// longitud.
		for (int i = 0; i < tabla.length; i++) {

			// Según el índice, le atribuimos un valor entre 1 y 100.
			tabla[i] = rnd.nextInt(1, 101);
		}
		// Hacemos un for each donde valor son los valores de la tabla.
		for (int valor : tabla) {

			// Imprimimos valor.
			System.out.println(valor);
		}

	}
}
