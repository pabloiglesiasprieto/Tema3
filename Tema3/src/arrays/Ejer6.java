package arrays;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A
		 * continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos
		 * números junto con la palabra “par” o “impar” según proceda.
		 */
		// Creamos la tabla que almacenará los 8 numeros enteros.
		int tabla[] = new int[8];

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que recorra los índices de la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos al usuario que introduzca el valor del indice i.
			System.out.println("Introduce el valor del índice " + i);

			// Leemos entrada de teclado y le asignamos el valor al índice de la tabla
			// correspondiente.
			tabla[i] = sc.nextInt();
		}

		// Creamos un bucle que recorra la tabla hasta llegar a la longitud de índice.
		for (int i = 0; i < tabla.length; i++) {

			// Si el valor de la tabla es par, entrará en el condicional
			if (tabla[i] % 2 == 0)

				// Imprimimos que el valor es par.
				System.out.println("El valor " + tabla[i] + " del índice " + i + " es par.");

			// Si no entra en el bloque if, entrará en el else.
			else

				// Imprimimos que el valor es impar.
				System.out.println("El valor " + tabla[i] + " del índice " + i + " es impar.");
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
