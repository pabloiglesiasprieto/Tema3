package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		/*
		 * Un anagrama es una palabra, o frase, que resulta de la transposición de otra
		 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
		 * mora. Construir una función que recibe dos palabras por parámetro e indique
		 * si son anagramas una de otra
		 */
		// Creamos la variable que almacenará la primera palabra.
		String primeraPalabra;

		// Creamos la variable que almacenará la segunda palabra.
		String segundaPalabra;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la primera palabra.
		System.out.println("Introduce la primera palabra");

		// Leemos entrada de teclado
		primeraPalabra = sc.nextLine();

		// Le preguntamos al usuario la segunda palabra.
		System.out.println("Introduce la segunda palabra");

		// Leemos entrada de teclado
		segundaPalabra = sc.nextLine();

		// Llamamos a la función e imprimimos el resultado.
		System.out.println(anagrama(primeraPalabra, segundaPalabra) ? "Es un anagrama" : "No es un anagrama");

		// Cerramos el Scanner.
		sc.close();
	}

	static boolean anagrama(String primeraPalabra, String segundaPalabra) {

		// Declaramos la variable que almacenará la primeraPalabra.
		char primerChar[];

		// Declaramos la variable que almacenará la segundaPalabra.
		char segundaChar[];

		// Creamos una variable booleana.
		boolean esAnagrama;

		// Convertimos el String a un array de caracteres.
		primerChar = primeraPalabra.toCharArray();

		// Convertimos el String a un array de caracteres.
		segundaChar = segundaPalabra.toCharArray();

		// Ordenamos los arrays.
		Arrays.sort(primerChar);
		Arrays.sort(segundaChar);

		// Comparamos si son anagramas.
		esAnagrama = Arrays.equals(primerChar, segundaChar);

		// Devolvemos el valor booleano
		return esAnagrama;
	}
}
