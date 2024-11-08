package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
		 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
		 * Luego muestra el array por pantalla.
		 */
		// Declaramos la variable que almacene el tamaño.
		int tamaño;

		// Declaramos la variable que almacenará el valor;
		int valor;

		// Declaramos la tabla donde se van a almacenar los valores.
		int tabla[];

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos el tamaño del array
		System.out.println("Introduce el tamaño del array.");

		// Leemos entrada del teclado.
		tamaño = sc.nextInt();

		// Preguntamos el valor a almacenar.
		System.out.println("Introduce el valor a almacenar.");

		// Leemos entrada de teclado.
		valor = sc.nextInt();

		// Le asignamos el tamaño dado por el usuario a la tabla.
		tabla = new int[tamaño];

		// Rellenamos los valores de tabla con el valor dado por el usuario.
		Arrays.fill(tabla, valor);

		// Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));
	}
}
