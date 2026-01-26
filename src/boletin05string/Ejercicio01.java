package boletin05string;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
		 * decir, la que contiene menos caracteres
		 * -----------------------------------------------------------------------------
		 */

		String frase1;
		String frase2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una primera frase: ");
		frase1 = sc.next();
		System.out.println("Introduzca una segunda frase: ");
		frase2 = sc.next();

		if (frase1.length() > frase2.length()) {
			System.out.println("La segunda frase introducida es más corta que la primera");
		} else {
			System.out.println("La primera frase introducida es más corta que la segunda");
		}

		sc.close();

	}

}