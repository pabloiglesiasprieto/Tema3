package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejer9 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde ir registrando el número de veces que ha
		 * salido cada número del euromillón.
		 */

		Map<Integer, Integer> numeros = new TreeMap<>();
		Map<Integer, Integer> estrellas = new TreeMap<>();

		Scanner scanner = new Scanner(System.in);
		String respuesta = "";

		do {
			// Solicitar los 5 números y 2 estrellas del último sorteo
			System.out.println("Introduce los 5 números del Euromillón (separados por espacio):");
			String[] inputNumeros = scanner.nextLine().split(" ");

			// Validamos la cantidad de números introducidos
			if (inputNumeros.length != 5) {
				System.out.println("Debes ingresar exactamente 5 números.");

			}

			// Solicitar las 2 estrellas del último sorteo
			System.out.println("Introduce las 2 estrellas del Euromillón (separadas por espacio):");
			String[] inputEstrellas = scanner.nextLine().split(" ");

			// Validamos la cantidad de estrellas introducidas
			if (inputEstrellas.length != 2) {
				System.out.println("Debes ingresar exactamente 2 estrellas.");

			}

			// Actualizar los números en el mapa
			for (String numStr : inputNumeros) {
				int num = Integer.parseInt(numStr);
				numeros.put(num, numeros.getOrDefault(num, 0) + 1);
			}

			// Actualizar las estrellas en el mapa
			for (String estrellaStr : inputEstrellas) {
				int estrella = Integer.parseInt(estrellaStr);
				estrellas.put(estrella, estrellas.getOrDefault(estrella, 0) + 1);
			}

			// Mostrar los números y las estrellas con su frecuencia
			System.out.println("\nNúmero de veces que ha salido cada número:");
			for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
				System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " veces");
			}

			System.out.println("\nNúmero de veces que ha salido cada estrella:");
			for (Map.Entry<Integer, Integer> entry : estrellas.entrySet()) {
				System.out.println("Estrella " + entry.getKey() + ": " + entry.getValue() + " veces");
			}

			// Preguntar si se desea registrar otro sorteo
			System.out.println("\n¿Quieres registrar otro sorteo? (sí/no)");
			respuesta = scanner.nextLine().toLowerCase();

		} while (respuesta.equals("sí"));

		// Cerrar el scanner
		scanner.close();
	}

}
