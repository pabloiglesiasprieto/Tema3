package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
		 * primeros en un array y los 10 últimos en otro array. Por último, comparará
		 * ambos arrays y le dirá al usuario si son iguales o no.
		 */
		// Declaramos la tabla donde almacenaremos los valores dados por el usuario.
		int valores[] = new int[20];

		// Declaramos la tabla donde copiaremos los 10 primeros valores.
		int firstHalf[];

		// Declaramos la tabla donde copiaremos los 10 ultimos valores.
		int secondHalf[];

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que irá recorriendo y asignando los valores.
		for (int i = 0; i < valores.length; i++) {

			// Le pedimos al usuario que introduzca el primer valor
			System.out.println("Introduce el valor " + (i + 1));

			// Leemos entrada de teclado.
			valores[i] = sc.nextInt();
		}
		// Copiamos los valores de la tabla valores (0-10)
		firstHalf = Arrays.copyOfRange(valores, 0, 10);

		// Imprimimos el Array.
		System.out.println(Arrays.toString(firstHalf));

		// Copiamos los valores de la tabla valores (10-20)
		secondHalf = Arrays.copyOfRange(valores, 10, 20);

		// Imprimimos el Array.
		System.out.println(Arrays.toString(secondHalf));

		// Cerramos el Scanner.
		sc.close();
	}

}
