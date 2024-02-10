import java.util.Scanner;
import java.util.ArrayList;
public class Asterisks {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>() ;
        Scanner scanner = new Scanner(System.in);
        collectInput(scanner, numbers);
        printAsterisks(numbers);
    }
    private static void collectInput(Scanner scanner, ArrayList<Integer> numbers) {
        int number = 0;
        while (number != 22){
            System.out.println("Enter number between 1 and 15 (enter 22 to stop): ");
            number = scanner.nextInt();
            if(number != 22){
                numbers.add(number);
            }
        }
    }
    public static void printAsterisks(ArrayList<Integer> numbers){
        for (Integer integer : numbers) {
            printAsterisk1(integer);
            System.out.println();
        }
    }
    private static void printAsterisk1(Integer integer) {
        for (int idx = 0; idx < integer; idx++) System.out.print("*");

    }
}
