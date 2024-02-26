public class FireDrillFour {

    public int[] ZeroAndOneNumbers(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                array[index] = 0;
            } else {
                array[index] = 1;
            }
        }
        return array;
    }

}
