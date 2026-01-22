package boletin04arraysfunciones;

import java.util.Random;

public class EjercicioBi03 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Define una función que reciba una tabla bidimensional y devuelva un booleano
		 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
		 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
		 * matriz. Delfine un método main que llame a la función y muestre por pantalla
		 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no
		 * -----------------------------------------------------------------------------
		 */

		Random rnd = new Random();

		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rnd.nextInt(1, 2);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println(matrizSimetrica(matriz));

	}

	public static boolean matrizSimetrica(int[][] matrizNoSimetrica) {

		boolean simetrica = false;

		int contador = 0;

		for (int i = 0; i < matrizNoSimetrica.length; i++) {
			for (int j = 0; j < matrizNoSimetrica[i].length; j++) {
				if (matrizNoSimetrica[i][j] == matrizNoSimetrica[j][i]) {
					simetrica = true;
					contador++;
				}
			}
		}
		if (contador == 10) {
			simetrica = true;
		} else {
			simetrica = false;
		}

		return simetrica;

	}

}