package boletin05string;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
		 * siguiente: el primer jugador introduce la contraseña; a continuación, el
		 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
		 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
		 * contraseña
		 * -----------------------------------------------------------------------------
		 */

		String contrasena = "";

		String intento = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la contraseña: ");
		contrasena = sc.next();

		do {

			System.out.println("Introduzca intento de contraseña: ");
			intento = sc.next();

			if (!intento.equals(contrasena)) {
				if (intento.length() > contrasena.length()) {
					System.out.println("El intento es más largo que la contraseña");
				} else {
					System.out.println("El intento es más corto que la contraseña");
				}
			} else {
				System.out.println("Has acertado la contraseña");
			}

		} while (!contrasena.equals(intento));

		sc.close();

	}

}