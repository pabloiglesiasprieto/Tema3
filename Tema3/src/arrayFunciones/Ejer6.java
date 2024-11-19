package arrayFunciones;

public class Ejer6 {
		public static void main(String[] args) {
			int[] t = { 10, 1, 5, 8, 9, 2 };
			int numElementos = 3;
			int[] resultado = suma(t, numElementos);

			// Imprimir el resultado
			for (int suma : resultado) {
				System.out.println(suma);
			}
		}

		public static int[] suma(int t[], int numElementos) {

			// Crear un array para almacenar las sumas
			int[] resultado = new int[t.length - numElementos + 1];

			// Calcular las sumas de los elementos consecutivos
			for (int i = 0; i <= t.length - numElementos; i++) {
				int suma = 0;
				for (int j = 0; j < numElementos; j++) {
					suma += t[i + j];
				}
				resultado[i] = suma;
			}

			return resultado;
		}
	}
