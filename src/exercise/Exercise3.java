package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        final int SIZE = 10;

        int[] numbers = new int[SIZE];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers.");

        for (int index = 0; index < SIZE; index++) {
            numbers[index] = scanner.nextInt();
        }

        int sum = 0;

        for (int index = 0; index < SIZE; index++)
        {
            sum += numbers[index];
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
