package boletin01arrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para calcular la suma de todos los números y,
		 * además, averiguar el máximo y mínimo y mostrarlos por pantalla
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array
		int[] array = new int[10];

		// Variable para la suma
		int suma = 0;

		// Variable para comprobar el número máximo
		int max = Integer.MIN_VALUE;

		// Variable para comprobar el número mínimo
		int min = Integer.MAX_VALUE;

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las posiciones del array, le va preguntando por un
		// número al usuario, lo va almacenando y va calculando la suma total
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca un número: ");
			array[i] = sc.nextInt();
			suma += array[i];
		}

		// Bucle for que recorre las posiciones del array con un condicional que
		// comprueba el número máximo y el mínimo del array
		for (int j = 0; j < array.length; j++) {
			if (array[j] > max) {
				max = array[j];
			}
			if (array[j] < min) {
				min = array[j];
			}
		}

		// Se imprime la suma, el máximo y el mínimo
		System.out.println("Suma: " + suma);
		System.out.println("Número máximo: " + max);
		System.out.println("Número mínimo: " + min);

		// Cierre del scanner
		sc.close();

	}

}