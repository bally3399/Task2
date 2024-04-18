public class Task4 {
    public static int[] highestNumber(int[] array) {
        int[] newArray = new int[2];
        int largest = 0;
        int number = 0;
        for (int index : array) {
            int count = 0;
            for (int idx : array) {
                if (index == idx) {
                    count++;
                }
            }
            if (count > largest) {
                largest = count;
                number = index;
            }
        }
        newArray[0] = largest;
        newArray[1] = number;
        return newArray;
    }

}
