package boletin07repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		frase = sc.next();
		
		System.out.println(Arrays.toString(obtenerPalabras(frase)));

		sc.close();

	}

	public static String[] obtenerPalabras(String frase) {

		frase.trim();
		
		frase.toLowerCase();
		
		String[] palabrasSeparadas = frase.split(" ");

		return palabrasSeparadas;

	}

}
