package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que cree una lista de nombres de personas vacía. A
		 * continuación, mostrará el siguiente menú. Atendiendo a la opción seleccionada
		 * por el usuario el programa debe realizar la operación concreta:
		 * 
		 * 1. Añadir nuevo nombre a la lista.
		 * 
		 * 2. Elimina un nombre específico.
		 *
		 * 3. Ordena la lista alfabéticamente.
		 *
		 * 4. Busca si un nombre específico está en la lista.
		 *
		 * 5. Salir.
		 */
		// Importamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la lista.
		ArrayList<String> lista = new ArrayList<String>();

		// Añadimos nombres a la lista.
		lista.add("Ana");
		lista.add("Juan");
		lista.add("Pedro");
		lista.add("Francisco");
		lista.add("Pablo");
		lista.add("Daniel");
		lista.add("Mónica");

		// Declaramos la variable que almacenará la elección del usuario.
		int eleccion;

		// Declaramos la variable que almacenará el nombre a añadir del usuario.
		String nombre;

		// Imprimimos la lista de acciones.
		System.out.println(
				"Que acción quieres realizar:\n 1. Añadir nuevo nombre a la lista.\n 2. Elimina un nombre específico.\n 3. Ordena la lista alfabéticamente.\n 4. Busca si un nombre específica está en la lista.\n 5. Salir");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos un bucle while hasta que el usuario decida salirse de él.
		while (eleccion != 5) {

			// Creamos un switch-case según la eleccion del usuario.
			switch (eleccion) {

			// Caso 1.
			case 1 -> {

				// Le pedimos al usuario que introduzca un nombre.
				System.out.println("Introduce el nombre a añadir en la lista.");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Añadimos el nombre a la lista.
				System.out.print(
						lista.add(nombre) ? "Nombre añadido correctamente" : "El nombre ya se encuentra en la lista.");

				// Rompemos el case.
				break;
			}
			// Caso 2.
			case 2 -> {

				// Le pedimos al usuario que introduzca el nombre a eliminar.
				System.out.println("Introduce el nombre a eliminar.");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Quitamos el nombre de la lista.
				System.out.println(lista.remove(nombre) ? "Nombre eliminado correctamente de la lista"
						: "No se ha encontrado el nombre en la lista.");

				// Rompemos el case.
				break;
			}
			// Caso 3.
			case 3 -> {

				// Ordenamos la lista.
				Collections.sort(lista);

				// Imprimimos que la lista se ha ordenado correctamente.
				System.out.println("Lista ordenada correctamente.");

				// Rompemos el case.
				break;

			}
			// Caso 4
			case 4 -> {

				// Le pedimos al usuario que introduzca el nombre a consultar.
				System.out.println("Introduce el nombre a consultar.");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Comprobamos si el nombre se encuentra en la lista.
				System.out.println(lista.contains(nombre) ? "El nombre se encuentra en la lista."
						: "El nombre no se encuentra en la lista.");

			}
			}
			// Imprimimos un salto de página.
			System.out.println();

			// Volvemos a imprimir el menú.
			System.out.println(
					"Que acción quieres realizar:\n 1. Añadir nuevo nombre a la lista.\n 2. Elimina un nombre específico.\n 3. Ordena la lista alfabéticamente.\n 4. Busca si un nombre específica está en la lista.\n 5. Salir");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos el buffer de entrada.
			sc.nextLine();

		}
		// Imprimimos la salida del bucle.
		System.out.println("Saliste.");

		// Cerramos Scanner.
		sc.close();

	}
}
