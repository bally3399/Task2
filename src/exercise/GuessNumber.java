package exercise;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int guess;
        int tries = 0;
        number = (int) (Math.random() * 100) + 1;

        System.out.println("Guess My Number Game");
        System.out.println();

        do {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = scanner.nextInt();

            tries++;
            if (guess > number) {
                System.out.println("Too high!!");
            } else if (guess < number) {
                System.out.println("Too low!!");
            }
            else {
                System.out.println("correct");
            }

        }while(number != guess);
    }
}
