package boletin04arraysfunciones;

import java.util.Random;

public class EjercicioBi04 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe
		 * una tabla bidimensional. La función devolverá true si la matriz introducida
		 * corresponde a una matriz mágica, que es aquella donde la suma de los
		 * elementos de cualquier fila o de cualquier columna valen lo mismo. En caso
		 * contrario devolverá false
		 * -----------------------------------------------------------------------------
		 */

		// Creación del random
		Random rnd = new Random();

		// Creación del array
		int[][] matrizMagica = new int[3][3];

		// Se rellena y se imprime el array
		for (int i = 0; i < matrizMagica.length; i++) {

			for (int j = 0; j < matrizMagica[i].length; j++) {

				matrizMagica[i][j] = rnd.nextInt(1, 5);

				System.out.print(matrizMagica[i][j] + "\t");

			}

			System.out.println();

		}

		// Se llama a la función
		System.out.println("¿La matriz es mágica? " + esMagica(matrizMagica));

	}

	/**
	 * 
	 * Función que comprueba las sumas de las filas y las columnas de la matriz y
	 * devuelve si es mágica o no mediante un booleano
	 * 
	 * @param tabla
	 * @return
	 */

	public static boolean esMagica(int tabla[][]) {

		boolean esMagica = true;

		int[] filas = new int[tabla.length];

		int[] columnas = new int[tabla[0].length];

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {

				filas[i] += tabla[i][j];

				columnas[j] += tabla[i][j];

			}

		}

		esMagica = true;

		for (int i = 0; i < tabla.length; i++) {

			if (filas[0] != filas[i]) {

				esMagica = false;

			}

			if (columnas[0] != columnas[i]) {

				esMagica = false;

			}

		}

		return esMagica;

	}
}