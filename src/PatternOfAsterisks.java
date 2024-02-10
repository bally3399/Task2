import java.util.Scanner;

public class PatternOfAsterisks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        for (int number1 = 1; number1 <= number; number1++){
            for (int row = 2; row <= number; row++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
