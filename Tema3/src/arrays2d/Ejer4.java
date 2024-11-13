package arrays2d;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
		 * fila). Muestra la tabla por pantalla.
		 */
		// Creamos la tabla 10x10
		int table[][] = new int[11][11];

		// Declaramos la variable que almacenará el resultado de la multiplicación.
		int resul;

		// Creamos un for que irá recorriendo los Arrays.
		for (int i = 0; i < table.length; i++) {

			// Creamos um for anidado que irá recorriendo los elementos del Array.
			for (int j = 0; j < table[0].length; j++) {

				// Le damos a la variable resul el resultado de la multiplicación de i*j.
				resul = j * i;

				// Imprimimos la multiplicación
				System.out.print(i + " x " + j + " = " + resul + " | ");

			}
			// Imprimimos un salto de página.
			System.out.println();
		}
	}
}
