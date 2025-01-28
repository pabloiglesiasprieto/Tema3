package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer15 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación de gestión de series de TV que permita al usuario
		 * realizar las siguientes operaciones:
		 * 
		 * Agregar serie: El usuario ingresa el nombre de la serie y su valoración, y se
		 * agrega al sistema.
		 * 
		 * Buscar serie: El usuario ingresa el nombre de la serie que desea buscar, y el
		 * sistema muestra su valoración si existe.
		 * 
		 * Eliminar serie: El usuario ingresa el nombre de la serie que desea eliminar,
		 * y el sistema la elimina de la lista de series.
		 * 
		 * Salir: Termina la ejecución del programa.
		 * 
		 * El programa debe utilizar la estructura de datos adecuada para almacenar las
		 * series.
		 * 
		 * Además, debe mostrar un menú de opciones y permitir al usuario realizar
		 * múltiples operaciones hasta que decida salir del programa.
		 */
		// Creamos un mapa.
		HashMap<String, Integer> mapa = new HashMap<>();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable que almacenará el nombre del canal.
		String serie;

		// Creamos la variable que almacenará la puntuación del canal.
		Integer puntuacion;

		// Creamos la variable que almacenará la elección de usuario.
		int eleccion;

		// Añadimos entradas al mapa.
		mapa.put("Naruto", 7);
		mapa.put("Doraemon", 10);
		mapa.put("FMAB", 5);
		mapa.put("Chainsaw Man", 4);
		mapa.put("Solo Leveling", 8);
		mapa.put("TBATE", 3);

		// Le preguntamos al usuario que acción quiere realizar.
		System.out.println(
				"Que acción quieres realizar:\n 1. Agregar serie\n 2. Busca serie\n 3. Eliminar serie\n 4. Salir");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos un while.
		while (eleccion != 4) {

			// Creamos un switch-case.
			switch (eleccion) {

			// Primer case.
			case 1 -> {

				// Le pedimos al usuario que introduzca el nombre de la serie.
				System.out.println("Introduce el nombre de la serie.");

				// Leemos entrada de teclado.
				serie = sc.nextLine();

				// Le pedimos al usuario que introduzca la puntuación de la serie.
				System.out.println("Introduce la puntuación de la serie");

				// Leemos entrada de teclado.
				puntuacion = sc.nextInt();

				// Añadimos el par al mapa.
				mapa.put(serie, puntuacion);

				// Salimos del case.
				break;
			}
			// Segundo case.
			case 2 -> {

				// Le pedimos al usuario que introduzca el nombre de la serie.
				System.out.println("Introduce el nombre de la serie.");

				// Leemos entrada de teclado.
				serie = sc.nextLine();

				// Si la serie se encuentra en el mapa, entrará en el condicional.
				if (mapa.containsKey(serie)) {

					// Imprimimos la puntuación.
					decirPuntuacion(serie, mapa);

					// Si no entra en el condicional es que la serie no se encuentra en el mapa.
				} else {

					// Imprimimos que no se encuentra en el mapa.
					System.out.println("La serie no se encuentra en el mapa.");
				}
				// Rompemos el case.
				break;
			}
			// Tercer caso.
			case 3 -> {

				// Le pedimos al usuario que introduzca el nombre de la serie.
				System.out.println("Introduce el nombre de la serie.");

				// Leemos entrada de teclado.
				serie = sc.nextLine();

				// Eliminamos el par del mapa.
				mapa.remove(serie);

				// Salimos del case.
				break;
			}
			}
			// Le preguntamos al usuario que acción quiere realizar.
			System.out.println(
					"Que acción quieres realizar:\n 1. Agregar serie\n 2. Busca serie\n 3. Eliminar serie\n 4. Salir");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos buffer de entrada.
			sc.nextLine();

		}
		// Imprimimos que ha salido del while.
		System.out.println("Saliste.");

		// Cerramos el Scanner.
		sc.close();

	}

	// Creamos una función para decir la puntuación.
	static void decirPuntuacion(String serie, HashMap<String, Integer> mapa) {

		// Recogemos la puntuación
		System.out.println("La puntuación de la serie " + serie + " es de " + mapa.get(serie));

	}
}
