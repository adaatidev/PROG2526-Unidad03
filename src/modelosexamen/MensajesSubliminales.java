package modelosexamen;

import java.util.Scanner;

public class MensajesSubliminales {

	public static void main(String[] args) {

		run();

	}

	/**
	 * Ejecuta la lectura de los textos, analiza si está el mensaje, imprime el
	 * mensaje y el resultado
	 */

	private static void run() {
		String texto = readLine("Introduce un texto: ");
		String mensaje = readLine("Introduce el mensaje a buscar: ");
		analyze(texto, mensaje);
		printResult(mensaje, result);
	}

	private static String readLine(String texto) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(texto);
		}
		return sc.nextLine();
	}

	private static void analyze(String textoBruto, String mensajeBruto) {
		String texto = normalizar(textoBruto);
		String mensaje = normalizar(mensajeBruto);
		char[] textoArray = texto.toCharArray();
		char[] mensajeArray = mensaje.toCharArray();
		int[] posiciones = buscarPosicionesInicio(textoArray, mensajeArray);
		int apariciones = posiciones.length;
		double porcentajeUso = calcularPorcentajeUso(textoArray, mensajeArray);
		imprimirResultados(mensajeBruto, posiciones, porcentajeUso);
	}

	private static int[] buscarPosicionesInicio(char[] texto, char[] mensaje) {
		int[] temporal = new int[texto.length];
		int count = 0;
		for (int i = 0; i < texto.length; i++) {
			if (texto[i] == mensaje[0] && sePuedeFormarDesde(texto, mensaje, )) {
				temporal[count] = i;
				count++;
			}
		}
		return recortarArray(temportal, count);
	}

	private static boolean 
	
	private static String normalizar(String input) {
		String lower;
		if (input == null || input.length() == 0) {
			lower = "";
		} else {
			lower = input.toLowerCase().trim().replace(" ", "");
		}
		return lower;
	}

}