package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        int[] result = number(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] number(int[] array){
        int counter = 0;
        int[] newArray = new int[array.length];
        for(int index = array.length - 1; index >= 0; index--){
            newArray[counter] = array[index];
            counter++;
        }
        return newArray;
    }
}
