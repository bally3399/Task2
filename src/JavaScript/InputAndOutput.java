package JavaScript;

public class InputAndOutput {
    public static int[] differences(int[] array) {
        int maximum = array[0];
        int minimum = array[0];
        for (int number : array) {
            if (number > maximum) maximum = number;
            if (number < minimum) minimum = number;
        }
        return new int[]{maximum - minimum};
    }

}
