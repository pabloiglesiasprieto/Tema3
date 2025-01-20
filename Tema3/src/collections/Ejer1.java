package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Crear una lista de números enteros positivos introducidos por consola hasta
		 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		 * por pantalla los índices de los elementos de valor par.
		 */
		// Creamos la lista.
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();

		// Importamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable número que almacenará los números dados por el usuario.
		int numero;

		// Creamos un bucle for que irá añadiendo valores.
		do {

			// Le preguntamos al usuario el número.
			System.out.println("Introduce un número");

			// Leemos entrada de teclado
			numero = sc.nextInt();

			// Añadimos el número a la lista.
			listaEnteros.add(numero);

			// La condición del número es hasta que el número sea negativo.
		} while (numero > 0);

		System.out.print("Los valores que son pares son los siguientes: ");

		// Hacemos un foreach que recorrerá la lista en busca de números pares.
		for (int valores : listaEnteros) {

			// Si el número es divisible entre 2, entrará en el condicional.
			if (valores % 2 == 0)

				// Imprimimos el valor.
				System.out.print(valores + " ");

		}
		// Cerramos el Scanner.
		sc.close();
	}
}
