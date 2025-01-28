package collections;

import java.util.TreeMap;

public class Ejer13 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra
		 * (solo los caracteres alfabéticos) en la siguiente cadena de texto y luego
		 * muestre el conteo por pantalla. Usa la implementación más apropiada:
		 * 
		 * 
		 * "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio,
		 * repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero,
		 * seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un
		 * agujero-hobbit, y eso significa comodidad"
		 */
		// Creamos un mapa para almacenar los chars.
		TreeMap<Character, Integer> mapa = new TreeMap<>();

		// Creamos la variable frase que almacenará la frase.
		String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio,repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// Declaramos una variable que servirá para contar el número de veces que
		// aparece.
		int valor = 0;

		// Creamos un for que irá recorrienda la frase.
		for (int i = 0; i < frase.length(); i++) {

			// Si la frase es una letra, entrará en el condicional.
			if (Character.isLetter(frase.charAt(i))) {

				// Si la letra no se encuentra en el mapa, la introducirá
				if (!mapa.containsKey(frase.charAt(i))) {

					// Colocamos el par en el mapa.
					mapa.put(frase.charAt(i), 1);

					// Si no entrá en el condicional, pasará al bloque else.
				} else {

					// Obtenemos el valor de la key.
					valor = mapa.get(frase.charAt(i));

					// Reemplazamos el valor de la key incrementado por 1.
					mapa.put(frase.charAt(i), ++valor);

				}

			}

		}
		// Imprimimos el mapa.
		System.out.println(mapa);

	}

}
