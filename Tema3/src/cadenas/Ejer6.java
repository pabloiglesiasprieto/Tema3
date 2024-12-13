package cadenas;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Realizar una función que reciba una frase como parámetro de entrada y nos
		 * indique si es palíndroma, es decir, que la frase sea igual leyendo de
		 * izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
		 * espacios. Un ejemplo de frase palíndroma es: “Dabale arroz a la zorra el
		 * abad”. Las vocales con tilde hacen que un algoritmo tome una frase palíndroma
		 * como si no lo fuese. Por esto, supondremos que el usuario introduce la frase
		 * sin tildes.
		 */
		// Declaramos la variable que almacenará la cadena original.
		String cadenaOriginal;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la cadena original.
		System.out.println("Introduce la cadena original.");

		// Leemos entrada de teclado.
		cadenaOriginal = sc.nextLine().toLowerCase();

		// Quitamos los espacios.
		cadenaOriginal = cadenaOriginal.replace(" ", "");

		// Llamamos a la función que le dará la vuelta.
		String cadenaInversa = invertir(cadenaOriginal);

		// Cadena inversa.
		System.out.println("Cadena Inversa.");

		// Imprimimos la cadena inversa.
		System.out.println(cadenaInversa + "\n");

		// Cadena Original.
		System.out.println("Cadena original");

		// Imprimimos la cadena original.
		System.out.println(cadenaOriginal + "\n");

		// Comparamos cadenas.
		System.out.println(cadenaInversa.equals(cadenaOriginal) ? "¡Son iguales!" : "No son iguales");

		// Cerramos el Scanner.
		sc.close();
	}

	// Creamos una función que invertirá la cadena.
	static String invertir(String cadenaOriginal) {

		// Inicializamos la cadenaInversa en vacio.
		String cadenaInversa = "";

		// Creamos un bucle que irá recorriendo los char de la cadena.
		for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {

			// Añadimos los char de la cadena a la variable cadenaInversa.
			cadenaInversa += cadenaOriginal.charAt(i);

		}
		// Devolvemos la cadena.
		return cadenaInversa;
	}

}
