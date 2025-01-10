package cadenas;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo que lea del teclado una frase e indique, para las letras
		 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
		 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un
		 * ejemplo sería: Frase: En un lugar de la Mancha. Resultado :
		 * 
		 * a 4 veces c: 1 vez d: 1 vez e: 2 veces
		 */
		// Creamos la variable que almacenará la cadena.
		String frase;

		// Creamos una variable que servirá como contador.
		int contador = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario la frase.
		System.out.println("Introduce la frase.");

		// Leemos entrada de teclado
		frase = sc.nextLine();

		// Llamamos a la función que contará las letras.
		cuentaLetras(frase, contador);

		// Cerramos el Scanner.
		sc.close();
	}

	// Creamos la función que contará las letras.
	public static void cuentaLetras(String frase, int contador) {

		// Creamos la variable caracter que almacenará los caracteres.
		char caracter;

		// Creamos un bucle que irá recorriendo los caracteres.
		for (int i = 0; i < frase.length(); i++) {

			// Almacenamos en la variable caracter el caracter a contar.
			caracter = frase.charAt(i);

			// Creamos un bucle que irá recorriendo las palabras contando el numero de veces
			// que aparece el caracter.
			for (int j = i; j < frase.length(); j++) {

				// Si el caracter coincide con el caracter a contar, entrará en el condicional.
				if (frase.charAt(j) == caracter && caracter != ' ')
					contador++; // Incrementamos el contador.

			}
			// Quitamos las palabras para que no se repitan.
			frase = frase.replace(caracter, ' ');

			// Imprimimos la letra y el numero de veces que se repite.
			if (caracter != ' ')
				// Imprimimos el numero de veces que se repite el caracter.
				System.out.println(
						contador <= 1 ? caracter + ": " + contador + " vez." : caracter + ": " + contador + " veces.");

			// Establecemos el contador a 0 para que cuenta otra letra.
			contador = 0;
		}
	}
}
