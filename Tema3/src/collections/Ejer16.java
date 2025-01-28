package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer16 {
	public static void main(String[] args) {
		/*
		 * Libreta de direcciones. Crea una aplicación que relacione nombres de personas
		 * con sus números de teléfono.
		 * 
		 * Hoy en día no es raro que una misma persona tenga varios númeos de teléfono:
		 * el de su casa, el móvil, el de la oficina, etc.
		 * 
		 * Para ello, cada persona tendrá una lista de teléfonos. Crea un menú con las
		 * siguientes opciones que permita al usuario realizar las siguientes acciones:
		 * 
		 * 1. Añadir persona.
		 * 
		 * 2. Añadir teléfono a una persona dada.
		 * 
		 * 3. Mostrar los teléfonos de una persona.
		 * 
		 * 4. Eliminar teléfono de una persona.
		 * 
		 * 5. Eliminar una persona.
		 */
		// Creamos un conjunto.
		HashSet<Integer> conjunto = new HashSet<>();

		// Creamos un mapa de conjuntos.
		HashMap<String, HashSet<Integer>> mapa = new HashMap<>();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable que almacenará la eleccion del usuario.
		int eleccion;

		// Imprimimos el menú.
		System.out.println(
				"Que acción quieres realizar:\n 1. Añadir persona\n 2. Añadir teléfono a una persona dada.\n 3. Mostrar los teléfonos de una persona. \n 4. Eliminar teléfonos de una persona.\n 5. Eliminar una persona");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

	}
}
