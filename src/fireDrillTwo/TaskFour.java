package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int score = 0;
        for (int index = 1; index <= 10; index++) {
            System.out.print("Enter score: ");
            score = scanner.nextInt();
            if(score % 2 == 0) {
                sum += score;
            }
        }
        System.out.println(score);

    }
}
