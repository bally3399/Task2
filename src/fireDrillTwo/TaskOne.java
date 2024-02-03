package fireDrillTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int index = 1; index < 10; index++){
            System.out.print("Enter score: ");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
