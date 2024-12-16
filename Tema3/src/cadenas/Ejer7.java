package cadenas;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
		 * devolver cuántas veces aparece la palabra en la frase.
		 */
		// Declaramos la variable que almacenará la cadena original.
		String cadena;

		// Declaramos la variable que almacenará el digito a buscar.
		char digito;

		// Declaramos la variable que almacenará el número de veces que se repite el
		// digito.
		int contador;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la cadena original.
		System.out.println("Introduce la cadena original.");

		// Leemos entrada de teclado.
		cadena = sc.nextLine();

		// Le preguntamos al usuario el digito a buscar.
		System.out.println("Introduce el digito a buscar.");

		// Leemos entrada de teclado
		digito = sc.next().charAt(0);

		// Llamamos a la función y le asignamos a contador el resultado
		contador = numeroVeces(cadena, digito);

		// Imprimimos el resultado
		System.out.println("El digito " + "'" + digito + "' " + "aparece en la palabra " + cadena + " un total de "
				+ contador + " veces.");

		// Cerramos el Scanner.
		sc.close();
	}

	// Creamos la función que contará el número de veces que se repite el digito en
	// la cadena.
	static int numeroVeces(String cadena, char digito) {

		// Inicializamos el contador a 0.
		int contador = 0;

		// Creamos un bucle que irá recorriendo el String.
		for (int i = 0; i < cadena.length(); i++) {

			// Si el char coincide con el digito, entrará en el condicional.
			if (cadena.charAt(i) == digito) {

				// Incrementamos en 1 el contador.
				contador++;
			}

		}
		// Devolvemos el contador.
		return contador;
	}
}
