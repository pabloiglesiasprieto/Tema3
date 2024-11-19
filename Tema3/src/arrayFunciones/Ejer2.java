package arrayFunciones;

import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
		 * contenido en la tabla t.
		 */
		// Creamos la tabla.
		int tabla[] = new int[10];

		// Creamos Random.
		Random rnd = new Random();

		// Creamos un bucle que irá asignando valores aleatorios.
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rnd.nextInt(0, 101);
		}

		// Imprimimos el resultado de la función.
		System.out.println(maximo(tabla));

	}

	// Creamos una función que calculará el valor máximo.
	static int maximo(int tabla[]) {

		// Declaramos el valor máximo.
		int maximo = Integer.MIN_VALUE;

		// Creamos un bucle que irá recorriendo todos los índices del array.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un condicional en el cual, si el valor es mayor al maximo, entrará
			// dentro.
			if (tabla[i] > maximo) {

				// Se asigna a máximo el valor del array.
				maximo = tabla[i];
			}
		}
		// Devolvemos máximo.
		return maximo;

	}
}
