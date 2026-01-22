package boletin04arraysfunciones;

public class EjercicioBi02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza una función que reciba una tabla bidimensional y devuelva en otro
		 * array distinto su transposición. Define un método main que llame a esta
		 * función pasándole una tabla bidimensional y muestre por pantalla el resultado
		 * -----------------------------------------------------------------------------
		 */

		// Creación del array de enteros
		int[][] enteros = new int[4][4];

		// Variable auxiliar para los números de la tabla
		int numero = 1;

		// Bucle for que rellena e imprime el array
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i].length; j++) {
				enteros[i][j] = numero;
				System.out.print(enteros[i][j] + "\t");
				numero++;
			}
			System.out.println();
		}
		System.out.println();
		// Se muestra la tabla transpuesta
		transposicion(enteros);
	}

	/**
	 * Función que crea el array de la tabla transpuesta y recoloca los números con
	 * dos bucles for
	 * 
	 * @param tablaEnteros
	 */

	public static void transposicion(int[][] tablaEnteros) {

		int[][] transpuesta = new int[4][4];

		for (int i = 0; i < transpuesta.length; i++) {
			for (int j = 0; j < transpuesta[i].length; j++) {
				transpuesta[i][j] = tablaEnteros[j][i];
				System.out.print(transpuesta[i][j] + "\t");
			}
			System.out.println();
		}

	}

}