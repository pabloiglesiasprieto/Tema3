package cadenas;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Declaramos la variable que almacenará la cadena original.
		String original;

		// Declaramos la variable que almacenará la cadena al revés.
		String reversed;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la cadena original.
		System.out.println("Introduce la cadena original.");

		// Leemos entrada de teclado
		original = sc.nextLine();

		// Llamamos a la función y almacenamos el resultado en una variable.
		reversed = invertir(original);

		// Imprimimos la cadena original.
		System.out.println("Original: " + original);

		// Imprimimos la cadena al revés.
		System.out.println("Reversed: " + reversed);
	}

	// Creamos una función que invertirá la cadena.
	static String invertir(String cadenaOriginal) {

		// Inicializamos la cadenaInversa en vacio.
		String cadenaInversa = "";

		// Creamos un bucle que irá recorriendo los char de la cadena.
		for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {

			// Añadimos los char de la cadena a la variable cadenaInversa.
			cadenaInversa += cadenaOriginal.charAt(i);
		}
		// Devolvemos la cadena.
		return cadenaInversa;
	}
}
