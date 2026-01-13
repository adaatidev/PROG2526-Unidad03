package boletin01arrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter
		 * -----------------------------------------------------------------------------
		 */

		// Array para los meses
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		// Array para las temperaturas
		double[] temperaturas = new double[meses.length];

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las posiciones del array (meses) preguntando por la
		// temperatura media de cada mes, almacenando la temperatura en su mes
		// correspondiente
		for (int i = 0; i < meses.length; i++) {
			System.out.print("Introduzca la temperatura media de " + meses[i] + ": ");
			temperaturas[i] = sc.nextDouble();
		}

		// Bucle for que recorre las posiciones del array (meses), imprime el mes y
		// los asteriscos dependiendo de su temperatura
		for (int j = 0; j < meses.length; j++) {
			System.out.print(meses[j] + ": ");

			for (int k = 0; k < (int) temperaturas[j]; k++) {
				System.out.print("*");
			}

			System.out.println();

		}

		// Cierre del scanner
		sc.close();

	}

}