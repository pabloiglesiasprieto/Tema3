package cadenas;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		/*
		 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
		 * imprimir tanto la palabra como el número de caracteres de la misma.
		 */
		// Creamos la variable que almacenará la cadena.
		String cadena;

		// Creamos un array que almacenarán las palabras de la frase.
		String palabras[];

		// Creamos la variable que almacenará la longitud máxima.
		int longitud = Integer.MIN_VALUE;

		// Creamos la variable que almacenará la posición.
		String palabra = "";

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la cadena.
		System.out.println("Introduce la cadena.");

		// Leemos entrada de teclado
		cadena = sc.nextLine();

		// Dividimos la cadena.
		palabras = cadena.split(" ");

		// Recorremos el array
		for (int i = 0; i < palabras.length; i++) {

			// Si la palabra es más grande que la longitud, entrará en el condicional.
			if (palabras[i].length() > longitud) {

				// Le asignamos a longitud la longitud de la palabra.
				longitud = palabras[i].length();

				// Almacenamos la palabra.
				palabra = palabras[i];
			}
		}
		// Imprimimos la palabra más larga.
		System.out.println("La palabra más larga es " + palabra + " con una longitud de " + longitud + " carácteres.");
		
		// Cerramos el Scanner.
		sc.close();

	}
}
