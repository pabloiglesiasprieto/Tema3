package cadenas;

import java.util.Random;
import java.util.Scanner;

public class Ejer16 {
	public static void main(String[] args) {
		/*
		 * Modificar el ejercicio anterior para que el programa indique al jugador 2, en
		 * cada intento, cuántas letras coinciden con el texto original.
		 */
		// Creamos la variable que almacenará la cadena.
		String frase;

		// Creamos la variable de la frase anagrada.
		String anagrama;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario la frase.
		System.out.println("Introduce la frase.");

		// Leemos entrada de teclado
		frase = sc.nextLine();

		while (frase.equals("")) {
			// Le decimos al usuario que la frase no tiene que estar vacía.
			System.out.println("La frase no tiene que estar vacía.");

			// Le pedimos al usuario que vuelva a introducir la frase.
			System.out.println("Vuelve a introducir la frase.");

			// Leemos entrada de teclado.
			frase = sc.nextLine();

		}

		// Llamamos a la función que hace el anagrama y lo almacenamos en la variable
		// anagrama.
		anagrama = anagrama(frase);

		// Imprimimos el anagrama.
		System.out.println(anagrama);

		// Cerramos el Scanner.
		sc.close();

	}

	// Creamos la función que creará el anagrama.
	static String anagrama(String frase) {

		// Creamos un Random
		Random rnd = new Random();

		// Declaramos la variable que almacenará el anagrama.
		String fraseAnagrada = "";

		// Declaramos la variable que almacenará la posición aleatoria.
		int posAleatoria = 0;

		// Declaramos la variable auxiliar.
		char aux;

		// Declaramos una variable que almacenará el anagrama.
		char[] anagrama = new char[frase.length()];

		// Declaramos el array que almacenará el array de chars.
		char[] fraseChars = frase.toCharArray();

		// Copiamos los valores que estén en la frase original.
		System.arraycopy(fraseChars, 0, anagrama, 0, anagrama.length);

		// Creamos un for que recorrerá el array.
		for (int i = 0; i < anagrama.length; i++) {

			// Creamos una posición aleatoria entre 0 y los índices del array.
			posAleatoria = rnd.nextInt(0, anagrama.length);

			// Guardamos en una variable auxiliar el valor de la primera posición.
			aux = anagrama[i];

			// Guardamos en el primer valor del array el valor de la posición aleatoria.
			anagrama[i] = anagrama[posAleatoria];

			// Intercambiamos el valor aleatorio con el primer valor.
			anagrama[posAleatoria] = aux;
		}
		// Convertimos a String el char.
		fraseAnagrada = String.valueOf(anagrama);

		// Devolvemos el anagrama.
		return fraseAnagrada;
	}
}
