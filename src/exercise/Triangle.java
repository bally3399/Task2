package exercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        for(int index = 0; index <= number; index++){
            for(int idx = index + 1; idx <= number; idx++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
