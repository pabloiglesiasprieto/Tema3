package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
		 * que se insertarán en una colección, de forma que se conserve el orden de
		 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
		 * pantalla.
		 */
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable que almacenará los nombres.
		String nombres = "";

		// Creamos el SET.
		LinkedHashSet<String> lista = new LinkedHashSet<String>();

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
