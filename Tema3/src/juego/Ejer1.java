package juego;

import java.util.Random;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba como parámetro una tabla bidimensional de
		 * enteros y un valor. Debe devolver un booleano indicando si dicho valor se
		 * encuentra en la tabla o no.
		 */
		// Declaramos la tabla bidimensional.
		int tabla[][];

		// Declaramos la variable que almacenará el valor a buscar.
		int valor;

		// Declaramos la variable que almacenará las filas.
		int filas;

		// Declaramos la variable que almacenará las columnas.
		int columnas;

		// Creamos Random.
		Random rnd = new Random();

		// Creamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario las filas del array.
		System.out.println("Cuales son las filas del array.");

		// Leemos entrada de teclado
		filas = sc.nextInt();

		// Le preguntamos al usuario las columnas del array.
		System.out.println("Cuales son las columnas del array.");

		// Leemos entrada de teclado
		columnas = sc.nextInt();

		// Creamos la tabla
		tabla = new int[filas][columnas];

		// Creamos un for que recorrerá los arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un for que recorrerá los elementos del array.
			for (int j = 0; j < tabla[0].length; j++) {

				// Vamos asignando valores aleatorios.
				tabla[i][j] = rnd.nextInt(1, 101);
			}
		}
		// Le preguntamos al usuario el valor a buscar.
		System.out.println("Que valor entre 0 y 100 quieres buscar.");

		// Leemos entrada de teclado.
		valor = sc.nextInt();

		// Creamos un while para controlar si el usuario ha introduce un valor fuera del
		// rango.
		while (valor < 0 || valor > 100) {

			// Le pedimos al usuario que introduzca un valor correcto.
			System.out.println("Introduce un valor correcto");

			// Leemos entrada de teclado.
			valor = sc.nextInt();
		}

		// Imprimimos si el valor se encuentra en la tabla o no.
		System.out.println(estaValor(tabla, valor) ? "El valor se encuentra en el array."
				: "El valor no se encuentra en el array.");

	}

	// Creamos la función estaValor que verá si el valor se encuentra en el array.
	static boolean estaValor(int tabla[][], int valor) {

		// Inicializamos la variable esta en false.
		boolean esta = false;

		// Creamos un índice para las filas.
		int i = 0;

		// Creamos un índice para las columnas.
		int j = 0;

		// Creamos un bucle que irá recorriendo las filas del array.
		while (i < tabla.length) {

			// Creamos un bucle que irá recorriendo las columnas del array.
			while (j < tabla[0].length) {

				// Si ha encontrado el valor, entrará en el if.
				if (tabla[i][j] == valor) {

					// Establecemos la variable booleana a true.
					esta = true;
				}
				// Incrementamos el índice de las columnas.
				j++;
			}
			// Incrementamos el índice de las filas.
			i++;
		}
		// Devolvemos el resultado de la función.
		return esta;
	}
}
