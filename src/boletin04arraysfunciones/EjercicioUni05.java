package boletin04arraysfunciones;

import java.util.Scanner;
import java.util.Random;

public class EjercicioUni05 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
		 * t, la función devolverá una tabla vacía
		 * -----------------------------------------------------------------------------
		 */

		// Variable para el valor buscado
		int valor;

		// Creación del random
		Random rnd = new Random();

		// Creación del array
		int[] array = new int[50];

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Se rellena el array con valores entre 1 y 20
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 21);
		}

		// Se le pregunta al usuario por el valor que hay que buscar
		System.out.println("Introduzca el valor de búsqueda: ");
		valor = sc.nextInt();

		// Se imprime la función que devuelve el array con las posiciones
		System.out.println("Posiciones " + buscarTodos(array, valor));

		// Cierre del scanner
		sc.close();

	}

	/**
	 * Función que comprueba que el valor buscado se encuentra en el array, si se
	 * encuentra devuelve un array con sus posiciones si no un array vacío
	 * 
	 * @param array
	 * @param valor
	 * @return array con posiciones
	 */

	public static int[] buscarTodos(int array[], int valor) {

		int contador = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				contador++;
			}
		}

		int[] posiciones = new int[contador];

		return posiciones;

	}

}