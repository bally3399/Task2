package exercise;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("Enter numbers (enter 0 to exit):");
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            if (number > 0)
                positiveCount++;
            else if (number < 0)
                negativeCount++;
            else
                zeroCount++;
        } while (number != 0);

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero numbers: " + zeroCount);
    }
}
