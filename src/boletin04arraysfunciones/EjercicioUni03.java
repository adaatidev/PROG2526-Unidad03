package boletin04arraysfunciones;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class EjercicioUni03 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive
		 * -----------------------------------------------------------------------------
		 */

		// Variables para almacenar la longitud y el fin de la tabla
		int longitud;
		int fin;

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Se le pregunta al usuario por la longitud y el fin de la tabla
		System.out.println("Introduzca la longitud de la tabla: ");
		longitud = sc.nextInt();

		System.out.println("Introduzca el fin de la tabla: ");
		fin = sc.nextInt();

		// Se imprime la tabla
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

		// Cierre del scanner
		sc.close();

	}

	/**
	 * Función que recorre el array, rellena sus posiciones con números pares
	 * aleatorios
	 * 
	 * @param longitud
	 * @param fin
	 * @return array relleno de números pares
	 */

	public static int[] rellenaPares(int longitud, int fin) {

		Random rnd = new Random();

		int[] array = new int[longitud];

		for (int i = 0; i < array.length; i++) {
			do {
				array[i] = rnd.nextInt(0, fin + 1);
			} while (array[i] % 2 != 0);
		}

		return array;

	}

}