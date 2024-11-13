package arrays2d;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
		 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
		 * notas por teclado y luego el programa mostrará la tabla con las notas. A
		 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
		 */
		// Creamos la tabla
		double tabla[][] = new double[4][5];

		// Declaramos la variable que almacenará la media.
		double suma = 0;

		// Declaramos la variable que almacenará mínima.
		double minima = Double.MAX_VALUE;

		// Declaramos la variable que almacenará la máxima;
		double maxima = Double.MIN_VALUE;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle.
		for (int i = 0; i < tabla.length; i++) {

			// Imprimimos que introduzca las notas del alumno
			System.out.println("Introduce las notas del Alumno " + (i + 1));

			// Creamos un bucle que vaya asignando las notas de las asignaturas.
			for (int j = 0; j < tabla[i].length; j++) {

				// Imprimimos la asignatura a asignar nota.
				System.out.println("Introduce la nota de la asignatura " + (j + 1));

				// Asignamos la nota al array.
				tabla[i][j] = sc.nextDouble();

				// Si la nota no está dentro del rango [0,10], entra en el bucle.
				while (tabla[i][j] < 0 || tabla[i][j] > 10) {

					// Le pedimos al usuario que introduzca un valor correcto.
					System.out.println("Introduce un valor correcto (0-10)");

					// Asignamos el valor.
					tabla[i][j] = sc.nextDouble();
				}

			}
		}
		// Creamos un bucle que vaya recorriendo los array de array.
		for (int i = 0; i < tabla.length; i++) {

			// Imprimimos el alumno al cual corresponde las notas.
			System.out.print("Alumno " + (i + 1 + ": "));

			// Creamos un bucle que vaya recorriendo los elementos del array.
			for (int j = 0; j < tabla[i].length; j++) {

				// Imprimimos las notas.
				System.out.print(tabla[i][j] + " | ");

				// Vamos sumando las notas a la variable suma
				suma += tabla[i][j];

				// Si la nota es más pequeño que el valor almacenado es mínimo, entra en el
				// condicional.
				if (tabla[i][j] < minima) {

					// Asignamos la nota a mínima.
					minima = tabla[i][j];
				}
				// Si la nota es más grande que el valor almacenado en máximo, entra en el
				// condicional.
				if (tabla[i][j] > maxima) {

					// Asignamos el valor a máxima
					maxima = tabla[i][j];
				}
			}
			// Imprimimos un salto de página para que salgan las notas de cada alumno en una
			// linea.
			System.out.println();

			// Imprimimos la media del alumno.
			System.out.println("La media del alumno es de " + suma / 5);

			// Imprimimos la nota media del alumno.
			System.out.println("La mínima del alumno es de " + minima);

			// Imprimimos la nota máxima del alumno.
			System.out.println("La máxima del alumno es de " + maxima);

			// Reestablecemos la variable de suma en 0 para que se sumen las notas del
			// siguiente alumno.
			suma = 0;

			// Reestablecemos la variable mínima para que se asigne la nota mínima del
			// siguiente alumno.
			minima = Double.MAX_VALUE;

			// Reestablecemos la variable máxima para que se asigne la nota máxima del
			// siguiente alumno.
			maxima = Double.MIN_VALUE;

			// Imprimimos un salto de página.
			System.out.println();
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
