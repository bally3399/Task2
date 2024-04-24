package exercise;

public class Exercise18 {
    public static int[] addToLastIndex(int[] array) {
        int[] newArray = new int[array.length];
        int counter = newArray.length - 1;
        for (int index = 0; index < array.length; index++) {
                newArray[counter] = array[index] + 1;
            }
//            newArray[index]  = array[counter] + 1;

        return newArray;
    }
}
