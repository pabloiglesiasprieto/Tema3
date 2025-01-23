package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Implementa el control de acceso al área restringida de un programa. Los
		 * nombres de usuario con sus correspondientes contraseñas deben estar
		 * almacenados en una estructura de la clase HashMap.
		 * 
		 * El programa mostrará un menú con dos opciones:
		 * 
		 * Registro. Debe pedir un nombre de usuario y una contraseña. A continuación,
		 * se almacenarán en el mapa.
		 * 
		 * Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario
		 * introduce los datos correctamente, el programa dirá “Ha accedido al área
		 * restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan
		 * las oportunidades el programa dirá “Lo siento, no tiene acceso al área
		 * restringida”.
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

		// Creamos una variable que servirá como contador de intentos.
		int intentos = 0;

		// Añadimos valores al diccionario.
		diccionario.put("admin", "admin");

		// Le pedimos al usuario que acción quiere realizar.
		System.out.println("Que acción quieres realizar. \n" + "1. Registro\n" + "2. Login\n" + "0. Salir");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos un while.
		while (eleccion != 0) {

			// Creamos un switch.
			switch (eleccion) {

			// Primer caso.
			case 1 -> {

				// Le pedimos al usuario el nombre de usuario.
				System.out.println("Introduce el nombre de usuario.");

				// Leemos entrada de teclado.
				clave = sc.nextLine();

				// Le pedimos al usuario la contraseña.
				System.out.println("Introduce la contraseña");

				// Leemos entrada de teclado.
				valor = sc.nextLine();

				// Añadimos el valor al diccionario.
				diccionario.put(clave, valor);

				// Rompemos el case.
				break;
			}
			// Segundo caso.
			case 2 -> {

				// Creamos un do-while para los intentos.
				do {

					// Le pedimos al usuario el nombre de usuario.
					System.out.println("Introduce el nombre de usuario.");

					// Leemos entrada de teclado.
					clave = sc.nextLine();

					// Le pedimos al usuario la contraseña.
					System.out.println("Introduce la contraseña");

					// Leemos entrada de teclado.
					valor = sc.nextLine();

					// Comprobamos si el valor existe en el diccionario.
					if (diccionario.containsKey(clave) && diccionario.get(clave).equals(valor)) {

						// Imprimimos que el usuario se ha logueado de manera correcta.
						System.out.println("Has iniciado sesión correctamente.");

						// Rompemos el case.
						break;

						// Si la entrada no existe en el diccionario, se aumentará el intentos.
					} else {

						// Incrementamos los intentos.
						intentos++;

						// Imprimimos que el usuario se ha equivocado.
						System.out.println("Te equivocaste.");
					}

					// Mientras que los intentos no sean 3.
				} while (intentos != 3);

			}
			}
			// Imprimimos un salto de línea.
			System.out.println();

			// Le pedimos al usuario que acción quiere realizar.
			System.out.println("Que acción quieres realizar. \n" + "1. Registro\n" + "2. Login\n" + "0. Salir");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos buffer de entrada.
			sc.nextLine();
		}

		// Cerramos el Scanner.
		sc.close();

	}
}
