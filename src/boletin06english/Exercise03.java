package boletin06english;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);

		int[] catchAFly = new int[10];

		int fly = rnd.nextInt(1, 11);

		int changePosition;

		int userPosition;

		changePosition = rnd.nextInt(0, 2);

		do {

			System.out.println("Where do you think is the fly, between 1 and 10?");
			userPosition = sc.nextInt();

			if (userPosition != fly) {
				System.out.println("The fly wasn't there!");

				if (changePosition == 0) {
					System.out.println("The fly is not in a contiguous position, the fly stays where it is.");
				} else if (changePosition == 1) {
					System.out.println("The fly is in a contiguous position");
					catchAFly[fly] += 1;
				}
			}

		} while (fly != userPosition);

		System.out.println("You caught the fly!");

		sc.close();

	}

}
