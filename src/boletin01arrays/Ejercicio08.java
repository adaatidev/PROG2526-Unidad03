package boletin01arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array
		int[] array = new int[100];

		// Creación del random
		Random rnd = new Random();

		// Variable que almacena el valor introducido por el usuario
		int num;

		// Variable de tipo string para mostrar las posiciones en cadena
		String cadena = "";

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Se le pregunta al usuario por el número que está buscando
		System.out.print("Introduzca un número entre 1 y 10: ");
		num = sc.nextInt();

		// Bucle for que recorre el array y lo rellena con valores aleatorios entre 1 y
		// 10
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 11);
		}

		System.out.print("Posiciones: ");

		// Bucle for que recorre las posiciones del array con un condicional que
		// comprueba la posicion del número introducido por el usuario
		for (int j = 0; j < array.length; j++) {

			if (num == array[j]) {
				cadena += j + ", ";
			}

		}

		// Quita la última coma
		cadena = cadena.substring(0, cadena.length() - 2);

		// Se imprime la cadena
		System.out.println(cadena);

		// Cierre del scanner
		sc.close();

	}

}