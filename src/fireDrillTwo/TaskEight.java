package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int index = 1; index <= 10; index++){
            System.out.print("Enter Score (between 0 - 100): ");
            int score = scanner.nextInt();
            if(score > 0 && score <= 100){
                sum += score;
            }

        }
        System.out.print(sum);
    }

}
