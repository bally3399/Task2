package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int index = 1; index <= 10; index++){
            System.out.print("Enter score: ");
            int score = scanner.nextInt();
            if(score % 2 == 0) {
                sum += score;
            }
        }
        System.out.println(sum);


    }
}
