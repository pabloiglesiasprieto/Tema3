package cadenas;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		/*
		 * Realizar un programa descodificador. La solución es tan sencilla como
		 * utilizar la función diseñada en el ejercicio anterior intercambiando los
		 * conjuntos entre sí.
		 */
		// Creamos el conjunto1.
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Creamos el conjunto2.
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creamos la variable que almacenará el conjunto1 en String.
		String conjunto1String = String.valueOf(conjunto1);

		// Creamos la variable que almacenará el conjunto2 en String.
		String conjunto2String = String.valueOf(conjunto2);

		// Creamos la variable que almacenará el mensaje a codificar.
		String mensaje;

		// Creamos la variable que almacenará el mensaje codificado.
		String mensajeCod = "";

		// Creamos la variable que almacenará los caracteres de la cadena.
		char c;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Introduce la cadena.
		System.out.println("Introduce la cadena.");

		// Leemos entrada de teclado.
		mensaje = sc.nextLine().toLowerCase();

		// Creamos un for que irá recorriendo la cadena.
		for (int i = 0; i < mensaje.length(); i++) {

			// Cojemos los char de la cadena.
			c = mensaje.charAt(i);

			// Si el valor se encuentra en el primer conjunto entrará en el condicional.
			if (conjunto2String.contains(String.valueOf(c))) {

				// Llamamos a la función que verá el valor correspondiente al conjunto2
				mensajeCod += codifica(conjunto2String, conjunto1String, c);

				// Si no coincide la letra, la imprimimos.
			} else
				mensajeCod += c;

			// Cerramos el Scanner
			sc.close();
		}

		// Mostramos el mensaje codificado.
		System.out.println("El mensaje codificado es: " + mensajeCod);
	}

	// Creamos una función que codificará el mensaje.
	static char codifica(String conjunto2String, String conjunto1String, char c) {

		// Creamos la variable que almacenará el caracter.
		char caracter;

		// Creamos la variable que almacenará la posicion.
		int posicion;

		// Le damos a la variable posición el valor donde ha encontrado el valor.
		posicion = conjunto2String.indexOf(c);

		// Obtenemos el valor.
		caracter = conjunto1String.substring(posicion, posicion + 1).charAt(0);

		// Devolvemos la variable.
		return caracter;
	}
}
