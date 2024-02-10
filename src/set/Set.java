package set;

import java.util.Arrays;

public class Set {
    private String[] elements = new String[3];
    private int numberOfElement;


    public boolean isEmpty() {
         return numberOfElement == 0;
    }

    public boolean add(String element) {
        if (!contains(element)) {
            elements[numberOfElement] = element;
            numberOfElement++;
            return true;
        } else {
            return false;
        }
    }

    public void remove(String element) {
        numberOfElement--;
    }

    public void removeAll() {
        numberOfElement = 0;
    }
    public boolean contains(String element) {
        for (int index = 0; index < numberOfElement; index++) {
            if (elements[index].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean containAll() {
        return true;
    }

    public int getSize() {
        return numberOfElement;
    }

    public boolean addAll() {
        return true;
    }
}
