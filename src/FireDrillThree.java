/*import java.util.Arrays;
import java.util.Scanner;

public class FireDrillThree {
    public static int[] taskOne() {
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[10];
        for(int index = 0; index <= 10; index++){
            score[index] = scanner.nextInt();
        }
        return score;

        }
    public static int[] taskTwo() {
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[10];
        for (int index = 0; index <= 10; index++) {
            score = new int[index];
            System.out.println(Arrays.toString(score));
        }
        return score;
    }

    public static int[] taskThree(){
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[10];
        for (int index = 0; index <= 10; index++) {
            score = new int[index];
            System.out.println(Arrays.toString(score));
        }
        return score;
    }
    public static int[] taskFour(int[] number) {
        int length = number.length;
        int length1 = (length + 1) / 2;
        int[] newArray = new int[length1];
        int counter = 0;
        for (int index = 1; index < length; index += 2) {
            newArray[counter] = number[index];
            counter++;
        }

        return newArray;
    }



    public static int[] taskFive(int[] array) {
        int length = array.length;
        int oddCount = (length + 1) / 2;

        int[] oddNumbers = new int[oddCount];
        int counter = 0;

        for (int index = 0; index < length; index++) {
            if (array[index] % 2 != 0) {
                oddNumbers[counter] = array[index];
                counter++;
            }
        }

        return oddNumbers;
    }

    public static int[] taskSix(int[] array){
		int sum = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			sum += array[index];
		}
		return sum;

	}

    public static void taskSeven(int[] array){
		int sum = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			sum += array[index];
		}
		return sum;

	}
    public int taskEight(int[] array){
		int length = array.length;
		int minimum = 0;
		for(int index = 0; index < length; index++){
		    if(minimum > array[index]){
			    minimum = array[index];
			}
	    }
		return minimum;
    }
    public int taskNine(int[] array){
        int length = array.length;
		int minimum = 0;
		for(int index = 0; index < length; index++){
		    if(minimum > array[index]){
			    minimum = array[index];
			}
	    }
		return minimum;
    }

     public int taskTen(int[] array){
		int length = array.length;
		int maximum = 0;
		for(int index = 0; index < length; index++){
		    if(maximum < array[index]){
			    maximum = array[index];
			}
	    }
		return maximum;
    }
    public int taskEleven(int[] array){
        int length = array.length;
		int maximum = 0;
		for(int index = 0; index < length; index++){
		    if(maximum < array[index]){
			    maximum = array[index];
			}
	    }
		return maximum;
    }


    public static int[] taskTwelve(int[] array) {
        if (array.length % 2 != 0) {
            int[] newArr = new int[array.length - 1];
            System.arraycopy(array, 0, newArr, 0, array.length - 1);
            array = newArr;
        }
        for (int index = 0; index < array.length - 1; index += 2) {
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }

        return arr;
    }

    public static int[] taskThirteen(int[] array) {
        if (array.length % 2 != 0) {
            int[] newArr = new int[array.length - 1];
            System.arraycopy(array, 0, newArr, 0, array.length - 1);
            array = newArr;
        }
        for (int index = 0; index < array.length - 1; index += 2) {
            if (array[index] % 2 == 1 && array[index + 1] % 2 == 1) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
            }
        }

        return array;
       }

       public static int[] taskFourteen(int[] array) {
        if (array.length % 2 != 0) {
            int[] newArr = new int[array.length - 1];
            System.arraycopy(array, 0, newArr, 0, array.length - 1);
            array = newArr;
        }
        for (int index = 0; index < array.length - 1; index += 2) {
            if (array[index] % 2 != 1 && array[index + 1] % 2 != 1) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
            }
        }

        return array;
    }

}*/