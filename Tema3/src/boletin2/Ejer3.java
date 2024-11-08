package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
		 * aleatorios entre 0 y 9. Luego ordena los valores del array y los mostrará por
		 * pantalla.
		 */
		// Declaramos e inicializamos la tabla con tamaño 30.
		int tabla[] = new int[30];

		// Importamos clase Random.
		Random rnd = new Random();

		// Creamos un for que le irá asignando a la tabla los valores dados por el
		// random.
		for (int i = 0; i < tabla.length; i++) {

			// Le asignamos a tabla con indice i el valor aleatorio entre 0 y 9.
			tabla[i] = rnd.nextInt(0, 10);
		}
		// Ordenamos la tabla.
		Arrays.sort(tabla);

		// Imprimimos el Array
		System.out.println(Arrays.toString(tabla));
	}
}
