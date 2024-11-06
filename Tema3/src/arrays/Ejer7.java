package arrays;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter.
		 */
		// Creamos la tabla que almacenará las temperatuas.
		double temperatura[] = new double[12];

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que irá pasando por los índices de la tabla.
		for (int i = 0; i < temperatura.length; i++) {

			// Le preguntamos la media de la temperatura del mes.
			System.out.println("Introduce la media de la temperatura del mes.");

			// Leemos entrada de teclado y asignamos el valor al indice de la tabla de
			// temperatura.
			temperatura[i] = sc.nextDouble();
		}
		// Creamos un bucle que vaya recorriendo los índices de la tabla
		for (int i = 0; i < temperatura.length; i++) {

			// Imprimimos la temperatura del mes.
			System.out.println("La temperatura del mes " + i + 1 + " es " + temperatura[i]);

			// Creamos un bucle que imprimirá los asteriscos según el valor del índice
			// correspondiente.
			for (int j = 0; j < temperatura[i]; j++) {

				// Imprimimos los asteriscos.
				System.out.print("* ");
			}
			// Creamos un salto de página.
			System.out.println();
		}
		// Cerramos el Scanner.
		sc.close();
	}

}
