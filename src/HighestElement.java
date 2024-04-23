public class HighestElement {

    public static int multiplicationOfTwoElement(int[] array) {
        if(array.length < 2) throw new IllegalArgumentException("Array should have more than 2 elements");
        int largest = array[0] * array[1];
        for (int index = 0; index < array.length; index++) {
            for (int idx = index + 1; idx < array.length; idx++) {
                int multiply = array[index] * array[idx];
                    if (multiply > largest) {
                        largest = multiply;
                }
            }
        }
        return largest;
    }

    public static int[] movingZeroInElementToTheLastIndex(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for(int idx = index + 1; idx < array.length; idx++){
                if (array[index] == 0) {
                    array[index] = array[idx];
                    array[idx] = 0;
                }
            }

        }

        return array;
    }

    public static int[] sortNumbers(int[] array) {
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            for(int idx = index + 1; idx < array.length; idx++){
                if (array[index] == 0) {
                    array[index] = array[idx];
                    array[idx] = temp;
                }
            }
        }
        return new int[]{temp};
    }
}

