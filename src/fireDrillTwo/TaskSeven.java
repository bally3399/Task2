package fireDrillTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int score = 0;
        for (int index = 1; index <= 10; index++) {
            System.out.print("Enter score: ");
            score = scanner.nextInt();
            if (score % 2 == 0) {
                sum += score;
            }
        }
        System.out.println(sum);
        int average = sum / score;
        System.out.println(average);

    }
}
