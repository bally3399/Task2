package fireDrillTwo;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int score = 0;
        for (int index = 1; index <= 10; index++) {
            System.out.print("Enter Score: ");
            score = scanner.nextInt();
            sum += score;

        }
        int average = sum / score;
        System.out.print(average);
    }
}
