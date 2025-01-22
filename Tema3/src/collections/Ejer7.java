package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
		 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
		 * para almacenar las parejas de palabras. El programa mostrará un menú con dos
		 * opciones:
		 * 
		 * Inserta palabra. Debe solicitar una palabra en español y su traducción al
		 * inglés.
		 * 
		 * Busca palabra. Pregunta por una palabra en español y devuelve su traducción
		 * en inglés.
		 * 
		 * Salir. Termina el programa.
		 */
		// Creamos el diccionario
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable que servirá para elección.
		int eleccion;

		// Creamos la variable que almacenará la clave.
		String clave;

		// Creamos la variable que almacenará el valor.
		String valor;

		// Añadimos valores al diccionario.
		diccionario.put("Agua", "Water");
		diccionario.put("Mascota", "Pet");
		diccionario.put("Madera", "Wood");
		diccionario.put("Paraguas", "Umbrella");
		diccionario.put("Escritorio", "Desktop");
		diccionario.put("Descargas", "Downloads");
		diccionario.put("Ventana", "Windows");
		diccionario.put("Diente", "Tooth");
		diccionario.put("Pie", "Foot");
		diccionario.put("Boca", "Mouth");
		diccionario.put("Mano", "Hand");
		diccionario.put("Dedo", "Finger");
		diccionario.put("Uña", "Nail");
		diccionario.put("Perro", "Dog");
		diccionario.put("Pájaro", "Bird");
		diccionario.put("Gato", "Cat");
		diccionario.put("Teclado", "Keyboard");
		diccionario.put("Ratón", "Mouse");
		diccionario.put("Árbol", "Tree");
		diccionario.put("Cama", "Bed");

		// Le preguntamos al usuario que quiere hacer.
		System.out
				.println("Que acción quieres realizar.\n" + "1. Inserta palabra\n" + "2. Busca Palabra\n" + "0. Salir");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos el buffer.
		sc.nextLine();

		// Creamos un bucle while que iterará hasta que usuario decida Salir.
		while (eleccion != 0) {

			// Creamos un switch para la eleccion.
			switch (eleccion) {

			// Si el usuario ha introducido 1, entrará en este case.
			case 1 -> {

				// Le pedimos al usuario que introduzca la clave.
				System.out.println("Introduce la clave");

				// Leemos entrada de teclado.
				clave = sc.nextLine();

				// Le pedimos al usuario que introduzca el valor.
				System.out.println("Introduce el valor");

				// Leemos entrada de teclado.
				valor = sc.nextLine();

				// Añadimos el valor al diccionario.
				diccionario.put(clave, valor);
			}
			// Si el usuario ha introducido 2, entrará en este case.
			case 2 -> {

				// Le pedimos al usuario que introduzca la clave.
				System.out.println("Introduce la clave.");

				// Leemos entrada de teclado.
				clave = sc.nextLine();

				// Imprimimos el valor.
				System.out.println(diccionario.get(clave));

			}

			}
			// Le preguntamos al usuario que quiere hacer.
			System.out.println(
					"Que acción quieres realizar.\n" + "1. Inserta palabra\n" + "2. Busca Palabra\n" + "0. Salir");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos el buffer de entrada.
			sc.nextLine();

		}
		// Le imprimimos al usuario que ha salido.
		System.out.println("Saliste.");

		// Cerramos el Scanner.
		sc.close();
	}
}
