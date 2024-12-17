package cadenas;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		/*
		 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
		 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
		 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
		 * minúsculas, mostrando siempre la codificación en minúsculas.
		 *
		 * char codifica(char conjunto1[],char conjunto2[], char c) que devuelve el
		 * carácter c codificado según los conjuntos 1 y 2 que se le pasan.
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
			if (conjunto1String.contains(String.valueOf(c))) {

				// Llamamos a la función que verá el valor correspondiente al conjunto2
				mensajeCod += codifica(conjunto1String, conjunto2String, c);

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
	static char codifica(String conjunto1String, String conjunto2String, char c) {

		// Creamos la variable que almacenará el caracter.
		char caracter;

		// Creamos la variable que almacenará la posicion.
		int posicion;

		// Le damos a la variable posición el valor donde ha encontrado el valor.
		posicion = conjunto1String.indexOf(c);

		// Obtenemos el valor.
		caracter = conjunto2String.substring(posicion, posicion + 1).charAt(0);

		// Devolvemos la variable.
		return caracter;
	}
}
