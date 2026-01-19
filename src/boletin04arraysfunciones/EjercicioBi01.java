package boletin04arraysfunciones;

import java.util.Arrays;
import java.util.Random;

public class EjercicioBi01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
		 * debe devolver un array de dos posiciones que contenga el mínimo en la
		 * posición 0 y el máximo en la posición 1. Define un método main que rellene un
		 * array de 6 filas por 10 columnas con números enteros positivos comprendidos
		 * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función
		 * con este array y mostrar por consola los valores mínimo y máximo de la tabla
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array que contiene los números enteros
		int[][] enteros = new int[6][10];

		// Creación del random
		Random rnd = new Random();

		System.out.println("TABLA");

		// Se rellena y se imprime la tabla
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i].length; j++) {
				enteros[i][j] = rnd.nextInt(1, 1001);
				System.out.print(enteros[i][j] + "\t");
			}
			System.out.println();
		}

		// Se llama a la función, imprime el mínimo y el máximo de la tabla
		System.out.println("Mínimo y máximo de la tabla: " + Arrays.toString(minimoMaximo(enteros)));

	}

	/**
	 * Función que comprueba el mínimo y el máximo del array de enteros y crea un
	 * array con solo el valor mínimo y máximo
	 * 
	 * @param array
	 * @return mínimo y máximo
	 */

	public static int[] minimoMaximo(int[][] array) {

		int[] minMax = new int[2];

		int min = Integer.MAX_VALUE;

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
		}

		minMax[0] = min;
		minMax[1] = max;

		return minMax;
	}

}