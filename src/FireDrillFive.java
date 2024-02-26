public class FireDrillFive {
    public boolean[] replaceEvenNumberWithFalseAndReplaceOddNumbersWithTrue(int[] array) {
        boolean[] newArray = new boolean[array.length];
        for (int index = 0; index < array.length; index++) {
            newArray[index] = (array[index] % 2 != 0);
        }
        return newArray;
    }

    public int[] number(){
        int[] array = new int[10];
        return array;
    }

}
