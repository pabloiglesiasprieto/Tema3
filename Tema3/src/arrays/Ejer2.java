package arrays;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Diseñar un programa que solicite al usuario 5 números decimales y los
		 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		 * números como para almacenarlos en la tabla. A continuación, en un bucle
		 * distinto, mostrar por consola los números en el mismo orden en el que se han
		 * introducido.
		 */
		// Creamos una tabla que almacenará los números dados por el usuario.
		int tabla[] = new int[5];

		// Importamos clase Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un valor que empiece en el índice 0 de la tabla hasta la longitud de
		// la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos al usuario que introduzca la posición i.
			System.out.println("Introduce la posición " + i);

			// Leemos entrada de teclado que se asignara al indice correspondiente.
			tabla[i] = sc.nextInt();
		}
		// Creamos un for que recorra la tabla imprimiendo los valores.
		for (int i = 0; i < tabla.length; i++) {

			// Imprimimos la el valor de cada posición.
			System.out.println("La posición " + i + " es " + tabla[i]);
		}

		// Cerramos el Scanner.
		sc.close();
	}
}
