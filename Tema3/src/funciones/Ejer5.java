package funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
		 * t, la función devolverá una tabla vacía.
		 */
		// Creamos un Random
		Random rnd = new Random();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la tabla con la longitud determinada.
		int tabla[] = new int[25];

		// Creamos la variable que almacenará el valor a buscar.
		int valor;

		// For que irá asignando valores.
		for (int i = 0; i < tabla.length; i++) {

			// Generamos numeros aleatorios hasta fin.
			tabla[i] = rnd.nextInt(1, 100) + 1;
		}

		// Le preguntamos al usuario el valor a buscar.
		System.out.println("Que valor desea buscar.");

		// Leemos entrada de teclado.
		valor = sc.nextInt();

		// Llamamos a la función.
		buscarTodos(tabla, valor);

		// Cerramos el Scanner.
		sc.close();
	}

	// Creamos la función buscarTodos.
	static int[] buscarTodos(int tabla[], int valor) {
		// Creamos un bucle que irá recorriendo el Array.
		for (int i = 0; i < tabla.length; i++) {

			// Si el valor de la tabla es igual al valor, en el array se almacenará el
			// indice.
			if (tabla[i] == valor) {

				// Asignamos al array el indice de éste.
				tabla[i] = i;

				// Si no se cumple la condición.
			} else {

				// Le asignamos al índice el valor 0.
				tabla[i] = 0;
			}
		}

		// Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));

		// Devolvemos la tabla.
		return tabla;
	}
}
