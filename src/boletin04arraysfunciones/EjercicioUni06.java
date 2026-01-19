package boletin04arraysfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioUni06 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Implementa la función: int[] suma(int t[], int numElementos), que crea y
		 * devuelve una tabla con las sumas de los numElementos elementos consecutivos
		 * de t
		 * -----------------------------------------------------------------------------
		 */

		// Variable que almacena de cuanto en cuanto se suma
		int grupo;

		// Creación del array
		int[] array = new int[18];

		// Creación del random
		Random rnd = new Random();

		// Creación del scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que rellena el array
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 11);
		}

		// Se imprime la tabla actual con todos sus valores
		System.out.println("Tabla actual: " + Arrays.toString(array));

		// Se le pregunta al usuario de cuanto en cuanto quiere sumar
		System.out.println("Introduzca la cantidad de números que quiere que se vayan sumando: ");
		grupo = sc.nextInt();

		// Se imprime el array con la suma de los números
		System.out.println("Tabla con los numeros sumados consecutivamente: " + Arrays.toString(suma(array, grupo)));

		// Cierre del scanner
		sc.close();

	}

	/**
	 * Función que crea el array y realiza las sumas
	 * 
	 * @param t
	 * @param numElementos
	 * @return suma
	 */

	public static int[] suma(int t[], int numElementos) {

		int suma = 0;

		int[] sumaConsec = new int[t.length - numElementos + 1];

		for (int i = 0; i < sumaConsec.length; i++) {

			for (int j = 0; j < numElementos; j++) {
				suma += t[i + j];
			}

			sumaConsec[i] = suma;

		}

		return sumaConsec;

	}

}