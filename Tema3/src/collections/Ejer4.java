package collections;

import java.util.Random;
import java.util.TreeSet;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
		 * distintos, menores que 10, en una colección. Hay que asegurarse de que se
		 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		 * mostrará la colección resultante por pantalla.
		 */
		// Creamos la variable donde se almacenaran los valores.
		int valores;

		// Creamos un Random.
		Random rnd = new Random();

		// Creamos la colección.
		TreeSet<Integer> lista = new TreeSet<Integer>();

		// Creamos un bucle que irá añadiendo valores a la lista.
		while (lista.size() < 20) {
			// Asignamos un valor aleatorio a valores.
			valores = rnd.nextInt(0, 100);

			// Añadimos el valor a la colección.
			lista.add(valores);
		}

		// Imprimimos la lista.
		System.out.println("La lista es la siguiente: ");
		for (int valor : lista) {

			// Imprimimos el valor.
			System.out.print(valor + " ");
		}

	}

}
