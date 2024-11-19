package arrayFunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma
		 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
		 * qué posición lo encuentra; y en caso contrario, devolverá -1.
		 */
		// Declaramos y creamos la tabla.
		int tabla[] = new int[100];

		// Creamos la variable que almacenará el número clave.
		int clave;

		// Creamos un Random
		Random rnd = new Random();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un for que irá asignando valores aleatorios al array.
		for (int i = 0; i < tabla.length; i++) {

			// Damos valores aleatorios al Array.
			tabla[i] = rnd.nextInt(1, 101);
		}

		// Le preguntamos al usuario el valor clave.
		System.out.println("Cual será el valor clave");

		// Leemos entrada de teclado.
		clave = sc.nextInt();

		// Llamamos a la función.
		buscar(tabla, clave);

		// Cerramos el Scanner.
		sc.close();

	}

	// Creamos la función buscar.
	static int buscar(int tabla[], int clave) {

		// Declaramos la variable que almacenará la variable donde se almacenará el
		// indice.
		int indice;

		// Ordenamos la tabla.
		Arrays.sort(tabla);

		// Hacemos un Binary search.
		indice = Arrays.binarySearch(tabla, clave);

		// Imprimimos el valor de indice
		System.out.println("El valor se encuentra en el indice " + indice);

		// Devolvemos el valor de indice.
		return indice;
	}
}
