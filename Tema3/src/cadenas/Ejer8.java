package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Implementa un programa que lea una frase y muestre todas sus palabras
		 * ordenadas de forma alfabética. Suponemos que cada palabra de la frase se
		 * separa de otra por un único espacio.
		 */
		// Variable que almacenará la cadena.
		String cadena;

		// Variable que almacenarán las palabras de la frase.
		String frase[];

		// Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos cadena
		System.out.println("Introduce la cadena");

		// Leemos entrada de datos.
		cadena = sc.nextLine();

		// Llamada a la función que ordena las palabras de la frase.
		frase = ordenarFrase(cadena);

		// Imprimimos el array.
		System.out.println(Arrays.toString(frase));
	}

	// Creamos función que ordenará la palabra.
	static String[] ordenarFrase(String cadena) {
		// Creamos un array que almacenarán las palabras de la frase.
		String[] palabras = cadena.split(" ");

		// Ordenamos las palabras del array.
		Arrays.sort(palabras);

		// Devolvemos el array.
		return palabras;
	}
}