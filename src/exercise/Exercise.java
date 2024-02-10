package exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        int number1 = Integer.parseInt(number);
        int counter = 0;
        int total = 0;
        while (number1 > 0){
            int num = number1 % 10;
            total += (int)(num * Math.pow(2, counter));
            number1 /= 10;
            counter++;
        }
        System.out.println(total);
    }
}
