package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 5, 6, 1, 7, 9, 3, 4, 8};
        int[] array1 = {2, 5, 6, 1, 7, 9, 3, 4, 8};
        int[] result = number(array);
        int[] result1 = number1(array1);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));

    }
    public static int[] number(int[] array){
        int temp = 0;
        int[] newArray = new int[array.length];
        for(int index = 0; index < array.length; index++){
            for(int idx = 0; idx < array.length; idx++ ){
                if(array[index] < array[idx]) {
                    temp = array[index];
                    array[index] = array[idx];
                    array[idx] = temp;
                }
            }
        }
        return array;
    }

    public static int[] number1(int[] array1){
        int temp = 0;
        for(int index = 0; index < array1.length; index++){
            for(int idx = 0; idx < array1.length; idx++ ){
                if(array1[index] > array1[idx]) {
                    temp = array1[index];
                    array1[index] = array1[idx];
                    array1[idx] = temp;
                }
            }
        }
        return array1;
    }



}
