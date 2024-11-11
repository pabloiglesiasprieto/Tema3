package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
		 * enteros aleatorios entre 0 y 99. Luego pedirá por teclado un valor y se
		 * mostrará por pantalla si ese valor existe en el array, además de cuántas
		 * veces.
		 */
		// Creamos el array de tamaño 1000
		int table[] = new int[1000];

		// Declaramos la variable que almacenará el dato dado por el usuario.
		int dato;

		// Declaramos e inicializamos la variable que servirá como contador de veces que
		// se ha repetido el número en el Array.
		int contador = 0;

		// Creamos random
		Random rnd = new Random();

		// Creamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario el dato que quiere buscar.
		System.out.println("Introduce el dato a buscar en el Array.");

		// Leemos entrada de teclado
		dato = sc.nextInt();

		// Creamos un for que irá recorriendo el array asignandole valores.
		for (int i = 0; i < table.length; i++) {

			// Generamos valores aleatorios entre 0 y 99.
			table[i] = rnd.nextInt(0, 100);
		}

		// Creamos un for que irá recorriendo el array asignandole valores.
		for (int i = 0; i < table.length; i++) {

			// Si el valor en el array es igual al indice, entrará en el if
			if (table[i] == dato) {

				// Imprimimos donde se ha encontrado el valor.
				System.out.println("El valor ha sido encontrado en el indice " + i);

				// Incrementamos en 1 el contador de veces encontrado.
				contador++;
			}
		}
		// Imprimimos el número de veces que se ha encontrado el valor en el Array.
		System.out.println("El valor se ha encontrado en el Array un total de " + contador + " veces.");
	}
}
