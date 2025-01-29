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
		// Creamos un mapa de conjuntos.
		HashMap<String, HashSet<Integer>> mapa = new HashMap<>();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable que almacenará el nombre de la persona.
		String nombrePersona;

		// Declaramos la variable que almacenará el teléfono de la persona.
		int telefono;

		// Declaramos el conjunto que almacenará los telefonos.
		HashSet<Integer> telefonos;

		// Declaramos la variable que almacenará la eleccion del usuario.
		int eleccion;

		// Imprimimos el menú.
		System.out.println(
				"Que acción quieres realizar:\n 1. Añadir persona\n 2. Añadir teléfono a una persona dada.\n 3. Mostrar los teléfonos de una persona. \n 4. Eliminar teléfonos de una persona.\n 5. Eliminar una persona\n 6. Salir");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Hacemos un while.
		while (eleccion != 6) {

			// Creamos un switch-case
			switch (eleccion) {

			// Primer case
			case 1 -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre de la persona a introducir.");

				// Leemos entrada de teclado.
				nombrePersona = sc.nextLine();

				// Introducimos el nombre de la persona al mapa.
				mapa.put(nombrePersona, new HashSet<Integer>());

				// Le decimos al usuario que la persona se ha introducido.
				System.out.println("La persona se ha introducido correctamente.");

				// Rompemos el case.
				break;

			}
			// Segundo case.
			case 2 -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre de la persona a introducir teléfonos.");

				// Leemos entrada de teclado.
				nombrePersona = sc.nextLine();

				// Le pedimos al usuario que introduzca el teléfono.
				System.out.println("Introduce el teléfono.");

				// Leemos entrada de teclado.
				telefono = sc.nextInt();

				// Obtenemos el conjunto de telefonos de la persona.
				telefonos = mapa.get(nombrePersona);

				// Añadimos el telefono al conjunto.
				telefonos.add(telefono);

				// Introducimos el conjunto de teléfonos a la persona.
				mapa.put(nombrePersona, telefonos);

				// Rompemos el case.
				break;
			}
			// Tercer case.
			case 3 -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre de la persona a introducir.");

				// Leemos entrada de teclado.
				nombrePersona = sc.nextLine();

				// Obtenemos los telefonos.
				telefonos = mapa.get(nombrePersona);

				// Imprimimos los teléfonos.
				System.out.println(telefonos);

				// Rompemos el case.
				break;
			}
			// Cuarto case.
			case 4 -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre de la persona a introducir.");

				// Leemos entrada de teclado.
				nombrePersona = sc.nextLine();

				// Obtenemos los telefonos.
				telefonos = mapa.get(nombrePersona);

				// Imprimimos los teléfonos.
				System.out.println(telefonos);

				// Le preguntamos al usuario que teléfono quiere borrar.
				System.out.println("¿Cuál telefono quiere borrar?");

				// Leemos entrada de teclado.
				telefono = sc.nextInt();

				// Borramos el telefono.
				telefonos.remove(telefono);

				// Colocamos el conjunto en el mapa.
				mapa.put(nombrePersona, telefonos);

				// Rompemos el case.
				break;
			}
			// Quinto case.
			case 5 -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre de la persona a introducir.");

				// Leemos entrada de teclado.
				nombrePersona = sc.nextLine();

				// Eliminamos a la persona del mapa.
				mapa.remove(nombrePersona);

				// Rompemos el case.
				break;
			}

			}

			// Imprimimos el menú.
			System.out.println(
					"Que acción quieres realizar:\n 1. Añadir persona\n 2. Añadir teléfono a una persona dada.\n 3. Mostrar los teléfonos de una persona. \n 4. Eliminar teléfonos de una persona.\n 5. Eliminar una persona\n 6. Salir");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos buffer de entrada.
			sc.nextLine();
		}
		// Imprimimos al usuario que ha salido del mapa.
		System.out.println("Saliste.");

		// Cerramos Scanner.
		sc.close();

	}
}
