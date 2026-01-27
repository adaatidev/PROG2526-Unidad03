package boletin06english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		int[] integers = new int[10];

		String answer;

		int value;

		int position;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("a. Show values");
			System.out.println("b. Introduce a value");
			System.out.println("c. Exit");
			answer = sc.next().toLowerCase();

			if (answer.equals("a")) {
				for (int i = 0; i < integers.length; i++) {
					System.out.print(integers[i] + "\t");
				}
			} else if (answer.equals("b")) {
				System.out.println("Enter a value: ");
				value = sc.nextInt();
				System.out.println("Enter a position: ");
				position = sc.nextInt();
			}

		} while (!answer.equals("x"));

		sc.close();

	}

}
