package exercise;

import java.util.Scanner;

public class SumOfDigit {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            System.out.print("Enter number: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter number: ");
            int number2 = scanner.nextInt();
            System.out.print("Enter number: ");
            int number3 = scanner.nextInt();
            int result = value(number, number1, number2, number3);
            System.out.print(result);


        }

        public static int value(int num1, int num2, int num3, int num4){
            int sum = 0;
            while(num1 > 0){
                sum += (num1 % 10);
                num1 = num1 / 10;
            }

            while(num2 > 0){
                sum += (num2 % 10);
                num2 = num2 / 10;
            }

            while(num3 > 0){
                sum += (num3 % 10);
                num3 = num3 / 10;
            }

            while(num4 > 0){
                sum += (num4 % 10);
                num4 = num4 / 10;
            }
            return sum;
        }

    }

