package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
		 * el orden alfabético.
		 */
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable que almacenará los nombres.
		String nombres = "";

		// Creamos el SET.
		TreeSet<String> lista = new TreeSet<String>();

		// Le preguntamos al usuario que añada un nombre.
		System.out.println("Introduce un nombre para añadir a la colleción.");

		// Leemos entrada de teclado.
		nombres = sc.nextLine();

		// Creamos un while que finalizará hasta que nombre sea fin.
		while (!nombres.equalsIgnoreCase("fin")) {

			// Añadimos el nombre a la colección.
			lista.add(nombres);

			// Preguntamos al usuario otra vez el nombre a añadir.
			System.out.println("Introduce un nombre para añadir a la colleción.");

			// Leemos entrada de teclado.
			nombres = sc.nextLine();
		}
		// Imprimimos la lista.
		System.out.println("La lista ordenada es la siguiente.");

		// Si la lista tiene tamaño 0 es que no tiene ningun valor.
		if (lista.size() == 0) {

			// Imprimimos que no tiene ningún valor.
			System.out.println("La lista no tiene ningun valor");

			// Si el tamaño no es 0 es que tiene valores.
		} else {

			// Creamos un foreach para imprimir la lista.
			for (String valores : lista) {

				// Imprimimos los nombres.
				System.out.print(valores + " ");
			}
		}
		// Cerramos el Scanner.
		sc.close();
	}

}
