package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N.
		 */
		// Creamos la tabla que almacenará los datos introducidos en la tabla.
		int table[] = new int[100];

		// Declaramos la variable que almacenará el índice al cual quiere acceder el
		// usuario.
		int eleccion = 0;

		// Creamos clase Random.
		Random rnd = new Random();

		// Creamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que recorrerá todos los índices de la tabla.
		for (int i = 0; i < table.length; i++) {
			table[i] = rnd.nextInt(1, 11);
		}

		// Le preguntamos al usuario que índice de la tabla quiere acceder.
		System.out.println("Introduce el valor que quieras ver cuantas veces se ha repetido en el array.");
		do {
			try {
				// Leemos entrada de teclado.
				eleccion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce un tipo de valor válido");
				continue;
			}
		} while (false);

		for (int i = 0; i < table.length; i++) {
			if (eleccion == table[i])
				System.out.println("Se ha repetido el valor " + eleccion + " en el índice de la tabla " + i);
		}
		
		// Cerramos el Scanner.
		sc.close();
	
	}
}
