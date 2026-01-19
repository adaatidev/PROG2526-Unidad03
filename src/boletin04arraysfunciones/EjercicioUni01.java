package boletin04arraysfunciones;

import java.util.Arrays;

public class EjercicioUni01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
		 * la suma de todos los valores almacenados en la tabla. Prueba el
		 * comportamiento de la función en un método main
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array
		int[] array = new int[8];

		// Relleno del array
		Arrays.fill(array, 8);

		// Se imprime la suma de todos los valores almacenados en la tabla
		System.out.println("La suma de todos los números en la tabla es de " + devuelveSuma(array));
	}

	/**
	 * Función que recorre el array, suma todos los números que hay en el array y
	 * devuelve la suma
	 * 
	 * @param array
	 * @return suma
	 */

	public static int devuelveSuma(int[] array) {

		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}

		return suma;
	}

}