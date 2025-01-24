package collections;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer12 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación que genere 10 números enteros aleatorios distintos
		 * en el rango del 1 al 20 y los guarde en una implementación que no permita que
		 * se dupliquen números en el caso de que se repitan y que garantice un orden
		 * basado en inserción. Luego, muestra los números únicos generados por
		 * pantalla.
		 */
		// Importamos un random
		Random rnd = new Random();

		// Creamos la lista.
		LinkedHashSet<Integer> lista = new LinkedHashSet<Integer>();

		// Generamos números aleatorios distintos hasta tener 10
		while (lista.size() < 10) {
			int numero = rnd.nextInt(20) + 1; // Genera un número aleatorio entre 1 y 20
			lista.add(numero);
		}

		// Mostrar los números generados
		System.out.println("Números generados: ");
		for (Integer num : lista) {
			System.out.println(num);
		}
	}
}
