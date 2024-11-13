package arrays2d;

import java.util.Arrays;
import java.util.Random;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
		 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
		 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de
		 * filas y columnas, igual que si de una hoja de cálculo se tratara. La suma
		 * total debe aparecer en la esquina inferior derecha. Un ejemplo de cómo deben
		 * mostrarse dichas sumas parciales sería:
		 */
		// Creamos la tabla 4x5
		int tabla[][] = new int[5][6];

		// Declaramos la suma.
		int suma = 0;

		// Importamos clase Random.
		Random rnd = new Random();

		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla[0].length - 1; j++) {
				tabla[i][j] = rnd.nextInt(100, 1000);
				suma += tabla[i][j];
				tabla[i][tabla[0].length - 1] = suma;
			}
			suma = 0;
		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

}
