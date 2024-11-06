package arrays;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para calcular la suma de todos los números y,
		 * además, averiguar el máximo y mínimo y mostrarlos por pantalla.
		 */
		// Declaramos la tabla que almacenará los 10 numeros.
		double tabla[] = new double[10];

		// Definimos e inicializamos el valor máximo y minimo.
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		// Definimos la variable que almacenará la suma de los índices.
		double suma = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que vaya recorriendo los indices de la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos al usuario que introduzca el valor del índice.
			System.out.println("Asigna un valor al indice " + i);

			// Leemos entrada de teclado.
			tabla[i] = sc.nextDouble();
		}
		// Recorremos la tabla.
		for (double valor : tabla) {

			// Si el valor del índice es mayor al valor max, entra en el condicional.
			if (valor > max)

				// Le damos a max el valor del índice.
				max = valor;

			// Si el valor del índice es mayor al min, entra en el condicional.
			if (valor < min)

				// Le damos a min el valor del índice.
				min = valor;

			// Vamos sumando los valores del índice a la variable suma.
			suma += valor;
		}
		// Imprimimos los resultados del minimo, máximo y la suma de los valores.
		System.out.println("El valor mínimo es de " + min);

		System.out.println("El valor maximo es de " + max);

		System.out.println("La suma de todos los valores es de " + suma);

		// Cerramos el Scanner.
		sc.close();
	}
}
