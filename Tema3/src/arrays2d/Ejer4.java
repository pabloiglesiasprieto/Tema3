package arrays2d;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
		 * fila). Muestra la tabla por pantalla.
		 */
		// Creamos la tabla 10x10
		int table[][] = new int[10][10];

		// Creamos un for que irá recorriendo los Arrays.
		for (int i = 0; i < table.length; i++) {

			// Creamos um for anidado que irá recorriendo los elementos del Array.
			for (int j = 1; j < table[0].length; j++) {

				// Imprimimos la multiplicación
				System.out.print(i + 1 + " x " + (j + 1) + " = " + (i + 1) * (j+1) + "   |   ");

			}
			// Imprimimos un salto de página.
			System.out.println();
		}
	}
}
