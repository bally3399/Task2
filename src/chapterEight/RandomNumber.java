package chapterEight;

import java.util.Scanner;
import java.security.SecureRandom;

public class RandomNumber {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int input = collectInput();
        for (int index = 1; index <= input; index++){
            System.out.printf("%d\t", generateNumber());
        }

    }

    public static  int collectInput(){
        System.out.println("Enter random number between (10 - 100)");
        return scanner.nextInt();

    }

    public static int generateNumber(){
        return 10 + random.nextInt(90);
    }


}
