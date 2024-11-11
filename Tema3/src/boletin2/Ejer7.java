package boletin2;

import java.util.Arrays;

public class Ejer7 {
	public static void main(String[] args) {
		// Creamos el Array.
		int[] array = new int[55];

		// Declaramos e inicializamos la variable indice en 0.
		int index = 0;

		// Creamos un bucle que irá incrementando en 1, i.
		for (int i = 1; i <= 10; i++) {

			// Rellenamos el Array.
			Arrays.fill(array, index, index + i, i);

			// Le sumamos a indice el valor de i
			index += i;
		}
		// Mostrar el array por pantalla
		System.out.println(Arrays.toString(array));
	}
}
