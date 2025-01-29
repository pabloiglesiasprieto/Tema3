package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer17 {
	public static void main(String[] args) {
		/*
		 * Clasificación de palabras: Crea un mapa cuya clave sea un número y su valor
		 * sea un conjunto de palabras, de forma que se clasifiquen las palabras por su
		 * longitud, es decir, en el conjunto con clave 3 se almacenarán palabras de
		 * longitud 3, en el conjunto de clave 4 se almacenarán palabras de longitud 4,
		 * y así sucesivamente.
		 * 
		 * 15. Frutifantastico.
		 * 
		 * 10. Patatatudo
		 * 
		 * 6. Patata.
		 */
		// Creamos un mapa.
		HashMap<Integer, HashSet<String>> mapa = new HashMap<>();

		// Creamos el conjunto de palabras.
		HashSet<String> palabras;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable que almacenará las palabras.
		String palabra;

		// Le pedimos al usuario que introduzca una palabra.
		System.out.println("Introduce una palabra.");

		// Leemos entrada de teclado.
		palabra = sc.nextLine();

		// Creamos un while.
		while (!palabra.equalsIgnoreCase("FIN")) {

			// Si la clave no se encuentra en el mapa, la colocamos.
			if (!mapa.containsKey(palabra.length())) {

				// Introducimos el par en el mapa.
				mapa.put(palabra.length(), new HashSet<String>());

			}

			// Obtenemos los conjuntos de la clave.
			palabras = mapa.get(palabra.length());

			// Añadimos la palabra al conjunto de palabras.
			palabras.add(palabra);

			// Introducimos el par en el mapa.
			mapa.put(palabra.length(), palabras);

			// Imprimimos el mapa.
			System.out.println(mapa);

			// Le pedimos al usuario que introduzca una palabra.
			System.out.println("Introduce una palabra.");

			// Leemos entrada de teclado.
			palabra = sc.nextLine();
		}
		// Imprimimos la salida.
		System.out.println("Saliste.");

		// Cerramos scanner.
		sc.close();
	}
}
