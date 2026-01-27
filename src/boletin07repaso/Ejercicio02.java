package boletin07repaso;

import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {

		Random rnd = new Random();

		double[] notas = new double[30];

		System.out.println("NOTAS");

		for (int i = 0; i < notas.length; i++) {
			notas[i] = rnd.nextDouble(0, 10);
			notas[i] = Math.round((notas[i] * 100.0) / 100.0);
			System.out.println(notas[i] + "\t");
		}

		System.out.println("MEDIA: " + calcularMedia(notas));
		System.out.println("NOTA MÁXIMA: " + notaMaxima(notas));
		System.out.println("NÚMERO DE APROBADOS: " + contarAprobados(notas));
		System.out.println();
		System.out.println("NOTAS MODIFICADAS CON INCREMENTOS: ");
		subirNotas(notas, 0);

	}

	public static double calcularMedia(double[] notas) {

		double media;

		int sumaTotal = 0;

		for (int i = 0; i < notas.length; i++) {
			sumaTotal += notas[i];
		}

		media = sumaTotal / notas.length;

		media = Math.round((media * 100.0) / 100.0);

		return media;

	}

	public static double notaMaxima(double[] notas) {

		double maxima = Integer.MIN_VALUE;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maxima) {
				maxima = notas[i];
			}
		}

		return maxima;

	}

	public static int contarAprobados(double[] notas) {

		int aprobados = 0;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				aprobados++;
			}
		}

		return aprobados;

	}

	public static void subirNotas(double[] notas, double incremento) {

		incremento = 0.5;

		for (int i = 0; i < notas.length; i++) {
			notas[i] += incremento;
			System.out.println(notas[i] + "\t");
		}

	}

}
