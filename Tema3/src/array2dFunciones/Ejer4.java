package array2dFunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe
		 * una tabla bidimensional. La función devolverá true si la matriz introducida
		 * corresponde a una matriz mágica, que es aquella donde la suma de los
		 * elementos de cualquier fila o de cualquier columna valen lo mismo. En caso
		 * contrario devolverá false.
		 */
		// Declaramos una tabla bidimensional
		int tabla[][];

		// Declaramos la variable que almacenará las filas del array.
		int filas;

		// Declaramos la variable que almacenará las columnas del array.
		int columnas;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un Random
		Random rnd = new Random();

		// Preguntamos el tamaño de las filas
		System.out.println("Introduce el tamaño de las filas");

		// Leemos entrada de teclado
		filas = sc.nextInt();

		// Preguntamos el tamaño de las columnas
		System.out.println("Introduce el tamaño de las columnas");

		// Leemos entrada de teclado
		columnas = sc.nextInt();

		// Creamos la tabla
		tabla = new int[filas][columnas];

		// Creamos un bucle que irá recorriendo los array del array
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los índices del array.
			for (int j = 0; j < tabla[0].length; j++) {

				// Generamos valores aleatorios para cada indice del array.
				tabla[i][j] = rnd.nextInt(1, 3);
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();

		}
		// Imprimimos si la tabla es mágica o no.
		System.out.println(magicTable(tabla) ? "Es mágica" : "No es mágica");
	}

	// Creamos la función que determinará si la tabla es mágica.
	static boolean magicTable(int tabla[][]) {
		// Creamos la variable que determinará si la tabla es magica
		boolean magic = true;

		// Creamos la variable que servirá para contador de indices
		int array = 0;

		// Creamos la variable que almacenará las sumas de la primera fila.
		int sumaPrimerFila = 0;

		int suma = 0;

		// Creamos la variable que almacenará la suma anterior
		int sumaAnterior = 0;

		// Creamos un for que irá recorriendo los índices del array.
		for (int i = 0; i < tabla[0].length; i++) {

			// Vamos sumando los elementos del array a la suma.
			sumaPrimerFila += tabla[array][i];
		}

		// Creamos un while que irá recorriendo el array hasta que se llegue a la
		// longitud del array y la tabla no sea mágica.
		while (magic && array<tabla.length) {

			// Creamos un for que irá recorriendo los índices del array.
			for (int i = 0; i < tabla[0].length; i++) {

				// Vamos sumando los elementos del array a la suma.
				suma += tabla[array][i];
			}
			if (sumaPrimerFila != suma) {
				magic = false;
			} else {
				array++;
			}
			suma = 0;
		}
		return magic;
	}
}
