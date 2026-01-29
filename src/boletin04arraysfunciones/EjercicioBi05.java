package boletin04arraysfunciones;

import java.util.Random;

public class EjercicioBi05 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realizar una función: int[][] gira90(int tablaInicio[][]), que dada una
		 * matriz de NxN (mismo número de filas y columnas), devuelve la tablaInicio
		 * girada 90º
		 * -----------------------------------------------------------------------------
		 */

		// Creación del random
		Random rnd = new Random();

		// Variable para el tamaño del array
		int tamano = 3;

		// Creación del array
		int[][] matriz = new int[tamano][tamano];

		System.out.println("TABLA ORIGINAL");

		System.out.println();

		// Se imprime el array con números aleatorios
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = rnd.nextInt(1, 21);

				System.out.print(matriz[i][j] + "\t");

			}

			System.out.println();

		}

		System.out.println();

		System.out.println("TABLA GIRADA 90º");

		// Se imprime la tabla girada
		int[][] tablaGirada = gira90(matriz);

		for (int i = 0; i < tamano; i++) {

			for (int j = 0; j < tamano; j++) {

				System.out.print(tablaGirada[i][j] + "\t ");

			}

			System.out.println();

		}

	}

	/**
	 * 
	 * Función que gira el array 90º
	 * 
	 * @param tablaInicio
	 * @return
	 */

	public static int[][] gira90(int tablaInicio[][]) {

		int[][] tablaGirada = new int[tablaInicio.length][tablaInicio[0].length];

		for (int i = 0; i < tablaGirada.length; i++) {

			for (int j = 0; j < tablaGirada[0].length; j++) {

				tablaGirada[i][j] = tablaInicio[(tablaGirada.length - 1 - j)][i];

			}

			System.out.println();

		}

		return tablaGirada;

	}

}