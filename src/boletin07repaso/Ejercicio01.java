package boletin07repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		String[] frases = obtenerPalabras(frase);

		System.out.println(Arrays.toString(obtenerPalabras(frase)));

		System.out.println("Número total de palabras: " + obtenerPalabras(frase).length);

		System.out.println("Cuántas palabras tienen cinco letras o más: " + contarPalabrasLargas(frases, 5));

		System.out.println("Palabra más larga encontrada: " + palabraMasLarga(frases));

		sc.close();

	}

	public static String[] obtenerPalabras(String frase) {

		frase = frase.trim().toLowerCase();

		String[] palabrasSeparadas = frase.split(" ");

		return palabrasSeparadas;

	}

	public static int contarPalabrasLargas(String[] palabras, int longitudMinima) {

		int contador = 0;

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() >= longitudMinima) {
				contador++;
			}
		}

		return contador;

	}

	public static String palabraMasLarga(String[] palabras) {

		String palabraLarga = "";

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > palabraLarga.length()) {
				palabraLarga = palabras[i];
			}
		}

		return palabraLarga;

	}

}
