package boletin06english;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		int length;

		int value;

		int increase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the array: ");
		length = sc.nextInt();

		System.out.println("Enter a value: ");
		value = sc.nextInt();

		System.out.println("Enter the increase: ");
		increase = sc.nextInt();

		int[] array = new int[length];

		array[0] = value;
		System.out.print(array[0] + "\t");

		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] + increase;
			System.out.print(array[i] + "\t");
		}

		sc.close();

	}

}
