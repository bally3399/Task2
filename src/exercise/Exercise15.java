package exercise;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        int number = scanner.nextInt();
        for(int count = 1; count <= 12; count++){
            System.out.println(number + " x " + count + " = " + (number*count));
        }
    }
}
