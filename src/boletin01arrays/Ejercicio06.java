package boletin01arrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A
		 * continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos
		 * números junto con la palabra “par” o “impar” según proceda
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array
		int[] array = new int[8];

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las posiciones del array, va preguntando por un número
		// al usuario y lo va almacenando
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduzca un número: ");
			array[i] = sc.nextInt();
		}

		// Bucle for que recorre las posiciones del array, imprime el número y mediante
		// un ternario imprime si es par o impar
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
			System.out.println(array[j] % 2 == 0 ? " - par" : " - impar");
		}

		// Cierre del scanner
		sc.close();

	}

}