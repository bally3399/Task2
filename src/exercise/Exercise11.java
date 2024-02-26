package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24} };
        displayRowMultiplication(A);
    }

    public static void displayRowMultiplication(int[][] array) {
        for (int index = 0; index < array.length; index++) {
            int rowMultiplication = 1;
            for (int idx = 0; idx < array[index].length; idx++) {
                rowMultiplication *= array[index][idx];
            }
            System.out.println((index + 1) + ": " + rowMultiplication);
        }
    }
}
