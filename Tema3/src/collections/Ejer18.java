package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejer18 {
	public static void main(String[] args) {
		/*
		 * Lista de tareas: Implementa una aplicación que permita a los usuarios
		 * gestionar una lista de tareas. Las tareas deben estar agrupadas por
		 * categorías (por ejemplo, trabajo, personal). Usa un mapa donde la clave sea
		 * la categoría y el valor sea una lista de tareas. Debe permitir añadir,
		 * eliminar y listar tareas por categoría.
		 */
		// Creamos el mapa.
		HashMap<String, ArrayList<String>> mapa = new HashMap<>();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable que almacenará las tareas.
		String tarea;

		// Declaramos la variable que almacenará la categoría.
		String categoría;

		// Declaramos la lista.
		ArrayList<String> tareas;

		// Declaramos la variable que almacenará la elección del usuario.
		int eleccion;

		// Introducimos categorias al mapa.
		mapa.put("Personal", new ArrayList<String>());
		mapa.put("Trabajo", new ArrayList<String>());
		mapa.put("Estudio", new ArrayList<String>());

		// Que acción quieres realizar.
		System.out.println(
				"Que acción quieres realizar:\n 1. Añadir tareas.\n 2. Eliminar tareas.\n 3. Imprimir tareas.\n 4. Salir");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos un while.
		while (eleccion != 4) {

			// Creamos un switch-case
			switch (eleccion) {

			// Primer case.
			case 1 -> {

				// Le pedimos al usuario que nombre la categoría.
				System.out.println("Introduce la categoria a introducir las tareas. (Personal, Trabajo o Estudio)");

				// Leemos entrada de teclado.
				categoría = sc.nextLine();

				// Le pedimos al usuario que introduzca la tarea.
				System.out.println("Introduce la tarea.");

				// Leemos entrada de teclado.
				tarea = sc.nextLine();

				// Obtenemos las tareas de la categoría.
				tareas = mapa.get(categoría);

				// Introducimos la tarea a la lista.
				tareas.add(tarea);

				// Añadimos la lista al mapa.
				mapa.put(categoría, tareas);

				// Rompemos el case.
				break;
			}
			// Segundo case.
			case 2 -> {

				// Le pedimos al usuario que nombre la categoría.
				System.out.println("Introduce la categoria a introducir las tareas. (Personal, Trabajo o Estudio)");

				// Leemos entrada de teclado.
				categoría = sc.nextLine();

				// Le pedimos al usuario que introduzca la tarea.
				System.out.println("Introduce la tarea.");

				// Leemos entrada de teclado.
				tarea = sc.nextLine();

				// Obtenemos las tareas de la categoría.
				tareas = mapa.get(categoría);

				// Quitamos la tarea.
				tareas.remove(tarea);

				// Imprimimos que la tarea se ha eliminado.
				System.out.println("La tarea ha sido eliminada.");

				// Rompemos el case.
				break;

			}
			// Tercer case.
			case 3 -> {

				// Le pedimos al usuario que nombre la categoría.
				System.out.println("Introduce la categoria a introducir las tareas. (Personal, Trabajo o Estudio)");

				// Leemos entrada de teclado.
				categoría = sc.nextLine();

				// Imprimimos la categoría.
				tareas = mapa.get(categoría);

				// Imprimimos la lista.
				System.out.println("La categoría " + categoría + " tiene las siguientes tareas " + tareas);
			}
			}

			// Que acción quieres realizar.
			System.out.println(
					"Que acción quieres realizar:\n 1. Añadir tareas.\n 2. Eliminar tareas.\n 3. Imprimir tareas.\n 4. Salir");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos buffer de entrada.
			sc.nextLine();

		}
		// Imprimimos salida.
		System.out.println("Saliste.");

		// Cerramos el Scanner.
		sc.close();

	}

}
