package boletin01arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100
		 * -----------------------------------------------------------------------------
		 */

		// Creación del random
		Random rnd = new Random();

		// Creación del array
		int[] array = new int[10];

		// Bucle for que recorre las posiciones del array y rellena con números
		// aleatorios entre 1 y 100
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 101);

			// Otra forma de imprimir el array
			// System.out.println(i);
		}

		// Se imprime el array
		System.out.println(Arrays.toString(array));

	}

}