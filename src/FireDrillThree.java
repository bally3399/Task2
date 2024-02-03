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
    }

    public static int[] taskThree(){
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[10];
        for (int index = 0; index <= 10; index++) {
            score = new int[index];
            System.out.println(Arrays.toString(score));
        }
    }
    public static int[] taskFour(int[] number) {
        int length = number.length;
        int length1 = (length + 1) / 2;
        int[] newArray = new int[length1];
        int counter = 0;
        for (int index = 1; index < length; index += 2) {
            newArray[counter] = array[index];
            counter++;
        }

        return newArray;
    }
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

    public static void taskSix(taskFour){
		int sum = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			sum += taskFour[index];
		}
		return sum;

	}

    public static void taskSeven(taskFive){
		int sum = 0;
		int length = array.length;
		for(int index = 0; index < length; index++){
			sum += taskFive[index];
		}
		return sum;

	}
    public int taskEight(taskFour){
		int length = taskFour.length;
		int minimum = 0;
		for(int index = 0; index < length; index++){
		    if(minimum > taskFour[index]){
			    minimum = taskFour[index];
			}
	    }
		return minimum;
    }
    public int taskNine(taskFive){
        int length = taskFive.length;
		int minimum = 0;
		for(int index = 0; index < length; index++){
		    if(minimum > taskFive[index]){
			    minimum = taskFive[index];
			}
	    }
		return minimum;
    }

     public int taskTen(taskFour){
		int length = taskFour.length;
		int maximum = 0;
		for(int index = 0; index < length; index++){
		    if(maximum < taskFour[index]){
			    maximum = taskFour[index];
			}
	    }
		return maximum;
    }
    public int taskEleven(taskFive){
        int length = taskFive.length;
		int maximum = 0;
		for(int index = 0; index < length; index++){
		    if(maximum < taskFive[index]){
			    maximum = taskFive[index];
			}
	    }
		return maximum;
    }



}*/

