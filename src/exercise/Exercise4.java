package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter five number");
        for (int index = 0; index< size; index++) {
            array1[index] = scanner.nextInt();
        }
            for(int idx = 0; idx < size; idx++) {
                array2[idx] = array1[idx];
            }
            for(int index = 0; index < size; index++) {
                System.out.println(array2[index]);
            }

    }
}
