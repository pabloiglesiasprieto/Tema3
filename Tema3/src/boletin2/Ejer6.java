package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
		 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
		 * (ordenada) con los 6 números de la combinación ganadora. La combinación
		 * ganadora debe establecerse en el momento de crear la tabla. El programa
		 * devolverá el número de aciertos.
		 */
		// Declaramos y creamos la tabla que almacenará la apuesta.
		int apuesta[] = new int[6];

		// Declaramos y creamos la tabla ganadora.
		int ganadora[] = new int[6];

		// Declaramos la variable que almacenará el número de aciertos.
		int aciertos = 0;

		// Importamos clase Random.
		Random rnd = new Random();

		// Creamos un for que irá asignando los valores a la tabla ganadora.
		for (int i = 0; i < ganadora.length; i++) {

			// Asignamos valores aleatorios entre 1 y 49.
			ganadora[i] = rnd.nextInt(1, 50);
		}
		// Ordenamos la tabla.
		Arrays.sort(ganadora);

		// Creamos un for que irá asignando los valores a la tabla apostadora.
		for (int i = 0; i < apuesta.length; i++) {

			// Asignamos valores aleatorios entre 1 y 49.
			apuesta[i] = rnd.nextInt(1, 50);

		}
		// Creamos otro bucle que irá recorriendo los arrays, viendo si hay algun
		// acierto.
		for (int i = 0; i < ganadora.length; i++) {

			// Si los valores son iguales, incrementos en 1 los aciertos.
			if (ganadora[i] == apuesta[i]) {

				// Incrementamos los aciertos.
				aciertos++;
			}

		}
		System.out.println(Arrays.toString(ganadora));
		System.out.println(Arrays.toString(apuesta));
		// Imprimimos el número de aciertos que ha tenido.
		System.out.println("Has conseguido un total de " + aciertos + " aciertos.");

	}
}
