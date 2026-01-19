package boletin04arraysfunciones;

import java.util.Scanner;
import java.util.Random;

public class EjercicioUni04 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma
		 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
		 * qué posición lo encuentra; y en caso contrario, devolverá -1
		 * -----------------------------------------------------------------------------
		 */

		// Creación del random
		Random rnd = new Random();

		// Creación del array
		int[] array = new int[8];

		// Variable para el valor buscado
		int clave;

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 11);
		}

		// Se le pregunta al usuario por el valor que está buscando
		System.out.println("Introduzca el valor clave: ");
		clave = sc.nextInt();

		// Se imprime la posición del valor buscado
		System.out.println("Posición: " + buscar(array, clave));

		// Cierre del scanner
		sc.close();

	}

	/**
	 * Función que recorre el array buscando el valor clave introducido por el
	 * usuario, si se encuentra da su posición y si no devuelve -1
	 * 
	 * @param array
	 * @param clave
	 * @return posicion
	 */

	public static int buscar(int array[], int clave) {

		int posicion = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == clave) {
				posicion = i;
			}
		}

		return posicion;

	}

}