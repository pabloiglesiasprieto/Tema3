package arrays;

import java.util.Arrays;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Define un array de 12 números enteros con nombre num y asigna los valores
		 * según la tabla que se muestra a continuación. Muestra el contenido de todos
		 * los elementos del array por consola. ¿Qué sucede con los valores de los
		 * elementos que no han sido inicializados?
		 */
		// Declaramos la tabla que almacenará los 12 números.
		int num[] = new int[12];

		// Asignamos los valores en cada índice correspondiente.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Imprimimos los valores de array.
		System.out.println(Arrays.toString(num));

		// COMO PODEMOS VER EN LA IMPRESION DEL ARRAY, LOS INDICES NO INICIALIZADOS SE
		// INICIALIZARÁN EN 0 POR QUE SU INICIALIZACIÓN NO SE HA INICIALIZADO.
	}
}
