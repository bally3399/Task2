public class HighestCommonFactor {

    public static int HighestCommon(int[] array) {
        int maximum = array[0];
        for (int number : array) {
            if (number > maximum) maximum = number;
        }
        for (int index = maximum; index >= 1; index--) {
            int counter = 0;
            for (int number : array) {
                if (number % index == 0) counter++;
            }
            if (counter == array.length) return index;
        }
        return 1;
    }
}



