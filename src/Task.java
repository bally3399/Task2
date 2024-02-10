public class Task {


    public static int[] doubleLength(int[] array) {
        int length1 = (array.length * 2);
        int counter = 0;
        int[] newArray = new int [length1];
        for(int index = 0; index < length1; index++){
            if(index < array.length){
                newArray[index] = array[index];
                continue;
            }
            newArray[index]=array[counter]*2;
            counter++;
        }
        return newArray;
    }
}
