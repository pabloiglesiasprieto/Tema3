package collections;

import java.util.Random;
import java.util.TreeSet;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores
		 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		 * ordenada. Pinta la colección por consola una vez rellena.
		 */
		// Creamos la lista ordenada.
		TreeSet<Integer> lista = new TreeSet<Integer>();

		// Creamos un Random
		Random rnd = new Random();

		// Creamos una variable que almacenará los valores.
		int valores;

		// Creamos un bucle con 30 iteraciones.
		for (int i = 0; i <= 30; i++) {

			// Le asignamos un valor aleatorio a valores.
			valores = rnd.nextInt(1, 11);

			// Añadimos el valor a la coleccion.
			lista.add(valores);
		}
		// Imprimimos la lista.
		System.out.print("En la lista se encuentran los siguientes valores: ");

		// Creamos un foreach para imprimir los valores.
		for (int valor : lista) {

			// Imprimimos el valor.
			System.out.print(valor + " ");
		}
	}
}
