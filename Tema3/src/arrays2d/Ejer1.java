package arrays2d;

import java.util.Arrays;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
		 * asigna los valores según la siguiente tabla. Muestra el contenido de todos
		 * los elementos del array dispuestos en forma de tabla como se muestra en la
		 * figura.
		 */
		// Creamos las tablas.
		int tabla[][] = new int[3][6];
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
		
		// Creamos un for que recorra los arrays del array.
		for (int i = 0; i < tabla.length; i++) {
			// 
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

}
