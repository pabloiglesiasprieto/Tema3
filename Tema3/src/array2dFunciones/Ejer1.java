package array2dFunciones;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
		 * debe devolver un array de dos posiciones que contenga el mínimo en la
		 * posición 0 y el máximo en la posición 1. Define un método main que rellene un
		 * array de 6 filas por 10 columnas con números enteros positivos comprendidos
		 * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función
		 * con este array y mostrar por consola los valores mínimo y máximo de la tabla.
		 */
		// Creamos la tabla
		int tabla[][] = new int[6][10];

		// Creamos un Random
		Random rnd = new Random();

		// Creamos un bucle que irá asignando valores aleatorios entre 0 y 1000
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				// Generamos valores aleatorios.
				tabla[i][j] = rnd.nextInt(0, 1001);
			}
		}
		// Llamamos a la función minMaxValue.
		minMaxValue(tabla);

	}

	// Creamos la función que creará una tabla y devolverá el valor mínimo y máximo
	// del array bidimensional.
	static int[] minMaxValue(int tabla[][]) {

		// Creamos la tabla de longitud 2.
		int tablaminimomaximo[] = new int[2];

		// Asignamos a máximo el valor más pequeño.
		int maximo = Integer.MIN_VALUE;

		// Asignamos al mínimo el valor más grande.
		int minimo = Integer.MAX_VALUE;

		// Creamos un bucle que irá recorriendo los arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los índices del array.
			for (int j = 0; j < tabla[0].length; j++) {

				// Si el valor es mayor al máximo, entrará en el condicional.
				if (tabla[i][j] > maximo) {

					// Asignamos a máximo el valor del array.
					maximo = tabla[i][j];
				}

				// Si el valor es más pequeño que el mínimo, entrará en el condicional.
				if (tabla[i][j] < minimo) {

					// Asignamos a mínimo el valor del array.
					minimo = tabla[i][j];
				}

				// Asignamos a la tabla en la posición 0 el valor almacenado en mínimo.
				tablaminimomaximo[0] = minimo;

				// Asignamos a la table en la posición 1 el valor almacenado en máximo.
				tablaminimomaximo[1] = maximo;
			}
		}

		// Creamos un bucle que irá recorriendo los Arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los elementos del Array.
			for (int j = 0; j < tabla[0].length; j++) {

				// Imprimimos los elementos del Array.
				System.out.print(tabla[i][j] + "\t");
			}
			// Creamos un salto de página para diferenciar los distintos Arrays del Array.
			System.out.println();
		}

		// Imprimimos la tabla que tiene almacenado el valor mínimo y máximo del Array.
		System.out.println(Arrays.toString(tablaminimomaximo));

		// Devolvemos el resultado de la tabla.
		return tablaminimomaximo;
	}
}
