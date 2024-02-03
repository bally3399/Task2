package fireDrillTwo;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int index = 1; index <= 10; index++){
            System.out.print("Enter Score: ");
            int score = scanner.nextInt();
            sum += score;

        }
        System.out.print(sum);
    }

}
