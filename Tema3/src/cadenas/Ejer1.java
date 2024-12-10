package cadenas;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
		 * decir, la que contiene menos caracteres.
		 */
		// Creamos las variables que almacenarán las cadenas dadas por el usuario.
		String primeraCadena, segundaCadena;

		// Declaramos las variables que almacenarán la longitud de las cadenas dadas por
		// el usuario.
		int longitudPrimeraCadena, longitudSegundaCadena;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la primera cadena.
		System.out.println("Introduce la primera cadena.");

		// Leemos entrada de teclado.
		primeraCadena = sc.nextLine();

		// Almacenamos la longitud en la variable.
		longitudPrimeraCadena = primeraCadena.length();

		// Le preguntamos al usuario la segunda cadena.
		System.out.println("Introduce la segunda cadena.");

		// Leemos entrada de teclado.
		segundaCadena = sc.nextLine();

		// Almacenamos la longitud en la variable.
		longitudSegundaCadena = segundaCadena.length();

		// Si la primera cadena es más grande entrerá en el condicional.
		if (longitudPrimeraCadena > longitudSegundaCadena)

			// Imprimimos que la primera cadena es más grande.
			System.out.println("La primera cadena es más grande");

		// Si no entrá en el primer condicional, verá si la segunda cadena es más grande
		// que la primera, entrará en el condicional.
		else if (longitudSegundaCadena > longitudPrimeraCadena)

			// Imprimimos que la segunda cadena es más grande.
			System.out.println("La segunda cadena es más grande");

		// Si no entrá en ninguno de los 2 condicionales, entrará en el bloque else.
		else

			// Imprime que ambas cadenas son iguales.
			System.out.println("Ambas son iguales");

		// Cerramos el Scanner.
		sc.close();
	}
}