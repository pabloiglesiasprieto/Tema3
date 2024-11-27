package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class Reto1 {
	public static void main(String[] args) {
		/*
		 * Debido a la crisis, el bar de Javier ha notado un descenso de las
		 * consumiciones. Además, según dicen en los telediarios, la ley antitabaco le
		 * está perjudicando aún más. Como no termina de creerse todo lo que dicen en la
		 * televisión, ha decidido hacer un estudio de mercado semanal de su
		 * establecimiento. Para ello, ha estado apuntando la caja diaria que se ha
		 * realizado en las últimas semanas. Le gustaría saber qué día de la semana se
		 * producen el mayor y el menor número de ventas, y si las ventas del domingo
		 * superan a la media semanal. De esta manera podrá establecer estrategias de
		 * marketing que le permitan recuperar algo de las ganancias perdidas.
		 * 
		 * Javier abre su bar todos los días menos los Lunes, que utiliza para
		 * descansar.
		 * 
		 * Realiza un programa que ayude a Javier en su cometido. Dada una lista de
		 * valores correspondiente a una semana, nuestro programa deberá decirle a
		 * Javier el día de la semana que más y menos ha vendido, y si las ventas del
		 * domingo superan la media.
		 */
		// En este array almacenararemos las ventas diarias de Javier.
		int[] semanales = new int[7];

		// Creamos un valor que almacenará el máximo.
		int max = Integer.MIN_VALUE;

		// Creamos un valor que almacenará el mínimo.
		int min = Integer.MAX_VALUE;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que irá asignando los valores al array.
		for (int i = 0; i < semanales.length; i++) {
			switch (i) {
			case 0 -> System.out.println("El Lunes está cerrado");
			case 1 -> {
				System.out.println("¿Que ventas tiene el Martes?");
				semanales[i] = sc.nextInt();
			}
			case 2 -> {
				System.out.println("¿Que ventas tiene el Miércoles?");
				semanales[i] = sc.nextInt();
			}
			case 3 -> {
				System.out.println("¿Qué ventas tiene el Jueves?");
				semanales[i] = sc.nextInt();
			}
			case 4 -> {
				System.out.println("¿Que ventas tiene el Viernes?");
				semanales[i] = sc.nextInt();
			}
			case 5 -> {
				System.out.println("¿Que ventas tiene el Sábado?");
				semanales[i] = sc.nextInt();
			}
			case 6 -> {
				System.out.println("¿Que ventas tiene el Domingo?");
				semanales[i] = sc.nextInt();
			}
			}
		}
		for (int i = 1; i < semanales.length; i++) {
			if (semanales[i] > max) {

				max = i;
			}

			if (semanales[i] < min) {

				min = i;
			}
		}
		System.out.println("El valor máximo de la semana es: " + semanales[max]);
		System.out.println("El valor mínimo de la semana es: " + semanales[min]);
	}
}
