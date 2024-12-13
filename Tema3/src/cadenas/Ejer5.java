package cadenas;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
		 * completa separando las palabras introducidas con espacios en blanco. Terminar
		 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
		 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
		 * “fin” no aparecerá en la frase final.
		 */
		// Declaramos la variable que almacenará la cadena.
		String cadena = "";

		// Declaramos la variable que almacenarán los caracteres.
		char caracter;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un fin que no finalizará hasta que termine en fin
		while (!cadena.endsWith("fin")) {

			// Le pedimos al usuario que introduzca la cadena.
			System.out.println("Introduce el caracter");

			// Leemos entrada de teclado.
			caracter = sc.next().charAt(0);

			// Añadimos al String el char.
			cadena += caracter;
		}
		// Imprimimos que salió del bucle
		System.out.println("Saliste");

		// Cerramos el Scanner.
		sc.close();
	}
}
