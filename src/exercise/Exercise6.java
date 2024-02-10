package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = number(array);
        int result1 = number1(array);
        System.out.println(result);
        System.out.println(result1);
    }

    public static int number(int[] array){
        int largest = Integer.MIN_VALUE;
        for(int index = 0; index < array.length; index++){
            if(largest < array[index]){
                largest = array[index];
            }
        }
        return largest;
    }

    public static int number1(int[] array){
        int smallest = Integer.MAX_VALUE;
        for(int index = 0; index < array.length; index++){
            if(smallest > array[index]){
                smallest = array[index];
            }
        }
        return smallest;
    }

}
