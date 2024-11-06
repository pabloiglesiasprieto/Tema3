package arrays;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea 10 números por teclado, los almacene en una
		 * tabla, y que luego los muestre en orden inverso, es decir, el primero que se
		 * introduce es el último en mostrarse.
		 */
		// Creamos la tabla que almacenará los números introducidos por teclado.
		int tabla[] = new int[10];

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que vaya recorriendo la tabla por índice.
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos al usuario que introduzca el valor.
			System.out.println("Introduce el valor " + i);

			// Leemos entrada de teclado.
			tabla[i] = sc.nextInt();
		}
		// Imprimimos el valor de la tabla invertida.
		System.out.println("La tabla invertida sería: ");

		// Creamos un for que recorra desde el final de la tabla hasta el índice 0.
		for (int i = tabla.length - 1; i >= 0; i--) {

			// Imprimimos el valor de la tabla.
			System.out.println("El valor del índice " + i + " es " + tabla[i]);
		}

		// Cerramos el Scanner.
		sc.close();
	}
}
