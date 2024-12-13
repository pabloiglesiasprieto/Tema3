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
		
		// Imprimimos los números de espacios.
		System.out.println("Hay un total de " + numeroEspacios(cadena) + " espacios.");
	}
	// Creamos una función que recorrerá la cadena buscando espacios.
	static int numeroEspacios(String cadena) {
		// Inicializamos la variable espacios en 0.
		int espacios = 0;

		// Creamos un bucle que irá recorriendo los char del string.
		for (int i = 0; i < cadena.length(); i++) {
			
			// Si el char es un espacio, aumentamos el contador.
			if (cadena.charAt(i) == ' ')
				
				// Incrementamos en 1 los espacios.
				espacios++;
		}

		// Devolvemos la cantidad de espacios.
		return espacios;

	}
}
