package cadenas;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Diseña una función que recibe una frase como parámetro y devuelva cuántos
		 * espacios en blanco tiene. Recuerda probar la función en un main.
		 */
		// Declaramos la variable que almacenará la frase dada por el usuario.
		String cadena;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario cual es la cadena.
		System.out.println("Introduce la cadena.");

		// Leemos entrada de teclado
		cadena = sc.nextLine();

		System.out.println("Hay un total de " + numeroEspacios(cadena) + " espacios.");
	}
	// Creamos una función que recorrerá
	static int numeroEspacios(String cadena) {
		int espacios = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ')
				espacios++;
		}

		return espacios;

	}
}
