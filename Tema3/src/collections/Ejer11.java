package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer11 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y
		 * luego la mezcle de forma aleatoria. Finalmente, muestra la lista original y
		 * la lista mezclada por pantalla.
		 */
		// Creamos la lista con los valores originales.
		ArrayList<Integer> listaOriginal = new ArrayList<Integer>();

		// Creamos la lista modificada.
		ArrayList<Integer> listaModificada = new ArrayList<Integer>();

		// Creamos un random.
		Random rnd = new Random();

		// Creamos un while para ir asignando valores aleatorios.
		while (listaOriginal.size() <= 10) {

			// Añadimos los valores.
			listaOriginal.add(rnd.nextInt(1, 11));
		}

		// Copiamos la lista a al otra lista.
		listaModificada.addAll(listaOriginal);

		// for para intercambiar valores.
		for (int i = 0; i < listaModificada.size(); i++) {

			// Reemplazamos los valores.
			Collections.swap(listaModificada, i, rnd.nextInt(0, listaModificada.size()));
		}

		// Imprimimos la lista original.
		System.out.println("Lista original:");
		System.out.println(listaOriginal);

		// Imprimimos la lista modificada.
		System.out.println("Lista modificada:");
		System.out.println(listaModificada);
	}
}
