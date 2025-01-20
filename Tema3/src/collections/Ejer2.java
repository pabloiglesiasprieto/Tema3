package collections;

import java.util.ArrayList;
import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		 * entre 5 y 10 elementos ambos inclusive.
		 */
		// Creamos la lista.
		ArrayList<Integer> lista = new ArrayList<Integer>();

		// Importamos un random.
		Random rnd = new Random();

		// Creamos la variable que almacenará los valores aleatorios.
		int valores;

		// Creamos la variable que almacenará el tamaño de la lista.
		int longitud = rnd.nextInt(5, 11);

		// Creamos la variable que almacenará la suma.
		int suma = 0;

		// Creamos la variable que almacenará el máximo.
		int maximo = Integer.MIN_VALUE;

		// Creamos la variable que almacenará el mínimo.
		int minimo = Integer.MAX_VALUE;

		// Creamos la variable que almacenará la media.
		double media = 0;

		// Creamos un for que iterará hasta la longitud definida por el random
		for (int i = 0; i <= longitud; i++) {

			// Generamos un valor aleatorio entre 0 y 100
			valores = rnd.nextInt(0, 101);

			// Añadimos el valor a la lista.
			lista.add(valores);
		}
		// Imprimimos los valores en la lista.
		System.out.print("Los valores en la lista son los siguientes: ");

		// Creamos un for each para imprimir los valores de la lista.
		for (int valor : lista) {
			// Imprimimos el valor.
			System.out.print(valor + " ");

			// Vamos viendo cual es el valor más grande.
			if (valor > maximo)
				maximo = valor;

			// Vamos viendo cual es el valor más pequeño.
			if (valor < minimo)
				minimo = valor;

			// Vamos sumando los valores.
			suma += valor;
		}
		// Creamos un salto de linea.
		System.out.println();

		// Calculamos la media.
		media = suma / longitud;

		// Imprimimos el resultado del mínimo, media, máximo y suma.
		System.out.println("Minimo: " + minimo);
		System.out.println("Máximo: " + maximo);
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
	}
}
