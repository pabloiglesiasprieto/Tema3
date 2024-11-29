package twodimensiongames;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * The size of the panel will be 3x3. There are two players who will play by
		 * turns. The first player to get 3 of his/her marks in a row (up, down, across,
		 * or diagonally) is the winner. When all 9 squares are full, the game is over.
		 * If no player has 3 marks in a row, the game ends in a tie. You have to print
		 * the board on the console. For example:
		 */
		// Creamos la tabla
		char tabla[][] = new char[3][3];

		// Creamos un bucle que irá recorriendo los arrays.
		for (int i = 0; i < tabla.length; i++) {

			// Creamos un bucle que irá recorriendo los índices.
			for (int j = 0; j < tabla[0].length; j++) {

				// Rellenamos el Array con '-'
				tabla[i][j] = '-';
			}

		}

	}
}
