package boletin01arrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Diseñar un programa que solicite al usuario 5 números decimales y los
		 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		 * números como para almacenarlos en la tabla. A continuación, en un bucle
		 * distinto, mostrar por consola los números en el mismo orden en el que se han
		 * introducido
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array
		double[] array = new double[5];

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las posiciones del array, va preguntando al usuario que
		// introduzca un número decimal y los va almacenando en el array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca un número decimal: ");
			array[i] = sc.nextDouble();
		}

		// Bucle for que imprime el array
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

		// Cierre del scanner
		sc.close();

	}

}