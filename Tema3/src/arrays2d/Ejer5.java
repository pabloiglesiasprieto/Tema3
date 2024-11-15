
package arrays2d;

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

		// Crea una matriz de 5 filas por 6 columnas (con una columna adicional para las
		// sumas).
		int tabla[][] = new int[5][6];

		// Inicializa la variable suma a 0. Se usará para acumular las sumas parciales.
		int suma = 0;

		// Instancia de Random para generar números aleatorios en el rango [100, 999].
		Random rnd = new Random();

		// Itera sobre las filas (excepto la última fila, que será para las sumas).
		for (int i = 0; i < tabla.length - 1; i++) {

			// Itera sobre las columnas (excepto la última columna, que será para las
			// sumas).
			for (int j = 0; j < tabla[0].length - 1; j++) {

				// Asigna un valor aleatorio entre 100 y 999 a la celda (i, j) de la tabla.
				tabla[i][j] = rnd.nextInt(100, 1000);

				// Acumula el valor de tabla[i][j] en la variable suma.
				suma += tabla[i][j];

				// Asigna la suma parcial de la fila a la última columna de la fila i.
				tabla[i][tabla[0].length - 1] = suma;
			}

			// Reinicia la variable suma para la siguiente fila.
			suma = 0;
		}

		// Itera sobre las columnas (excepto la última columna que es para la suma
		// total).
		for (int j = 0; j < tabla[0].length - 1; j++) {

			// Itera sobre las filas (excepto la última fila, que es para las sumas).
			for (int i = 0; i < tabla.length - 1; i++) {

				// Acumula el valor de la columna en la variable suma.
				suma += tabla[i][j];

				// Asigna la suma parcial de la columna a la última fila (fila de sumas).
				tabla[tabla.length - 1][j] = suma;
			}

			// Reinicia la variable suma para la siguiente columna.
			suma = 0;
		}

		// Itera sobre las filas (excepto la última fila que es para las sumas).
		for (int i = 0; i < tabla.length - 1; i++) {

			// Itera sobre todas las columnas (incluyendo la última columna).
			for (int j = 0; j < tabla[0].length; j++) {

				// Acumula el valor de cada celda de la tabla en la variable suma.
				suma += tabla[i][j];

				// Asigna la suma total a la última celda en la esquina inferior derecha.
				tabla[tabla.length - 1][tabla.length] = suma;
			}
		}

		// Itera sobre las filas de la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Itera sobre las columnas de la tabla.
			for (int j = 0; j < tabla[0].length; j++) {

				// Imprime el valor de la celda (i, j) con espacio extra para alineación.
				System.out.print(tabla[i][j] + "        ");
			}

			// Imprime una nueva línea al final de cada fila para que se vean separadas.
			System.out.println();
		}
	}
}
