package boletin06english;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);

		int posicion = 0;

		int userPosition;

		boolean mine = false;

		char[] minesweeper = new char[20];

		Arrays.fill(minesweeper, '0');

		for (int i = 0; i < 6; i++) {
			posicion = rnd.nextInt(0, 20);
			if (minesweeper[posicion] == '*') {
				i--;
			} else {
				minesweeper[posicion] = '*';
			}
		}

		for (int i = 0; i < minesweeper.length; i++) {
			if (minesweeper[i] == '*' && minesweeper[i] != 19 && minesweeper[i] != 0) {
				minesweeper[i - 1] += 1;
				minesweeper[i + 1] += 1;
			} else if (minesweeper[i] == 19) {
				minesweeper[i - 1] += 1;
			} else if (minesweeper[i] == 0) {
				minesweeper[i + 1] += 1;
			}
		}

		do {
			System.out.println("Enter a position: ");
			userPosition = sc.nextInt();

			if (minesweeper[userPosition - 1] == '*') {
				System.out.println("GAME OVER, YOU FOUND A MINE");
				mine = true;
			} else {
				System.out.println(minesweeper[userPosition - 1] + "\t");
			}
		} while (mine == false);

		sc.close();

	}
}