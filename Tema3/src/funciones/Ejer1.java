package funciones;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
		 * la suma de todos los valores almacenados en la tabla. Prueba el
		 * comportamiento de la función en un método main.
		 */
		// Creamos la tabla.
		int tabla[] = { 0, 1, 2, 3, 4 };
		
		// Imprimimos el resultado de la función.
		System.out.println(sumaArray(tabla));
	}
	// Creamos la función que sumará los datos del array.
	static int sumaArray(int tabla[]) {
		
		// Declaramos e inicializamos la variable suma en 0.
		int suma = 0;
		
		// Creamos un bucle que irá recorriendo los valores del array.
		for (int i = 0; i < tabla.length; i++) {
			
			// Vamos sumando los valores del array.
			suma += tabla[i];
		}
		
		return suma;
	}

}
