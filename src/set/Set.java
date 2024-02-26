package set;

import java.util.Arrays;

public class Set {
    private String[] elements = new String[3];
    private String element;
    private int numberOfElement;


    public boolean isEmpty() {
         return numberOfElement == 0;
    }

    public boolean add(String element) {
        if(getSize() == elements.length) createNewArray();
        if (!contains(element)) {
            elements[numberOfElement] = element;
            numberOfElement++;
            return true;
        } else {
            return false;
        }
    }

    public void remove(String element) {
        String[] temp = new String[3];
        int count = 0;
        for (String s : elements) {
            if (s != null && s.equals(element)) continue;
            temp[count] = s;
            count++;
        }
        elements = temp;
        numberOfElement--;
    }

    public boolean removeAll(Set elements2) {
        boolean condition = false;
        for(String element : elements2.elements)
            condition = contains(element);
        if(condition) remove(element);
        return true;
    }
    public boolean contains(String element) {
        for (int index = 0; index < numberOfElement; index++) {
            if (elements[index].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean containAll(Set element1) {
        boolean condition = false;
        for(String element : element1.elements)
            condition = contains(element);
        return true;
    }

    public int getSize() {
        return numberOfElement;
    }

    public boolean addAll(Set elements1) {
        boolean condition = false;
        for(String element : elements1.elements)
            condition = contains(element);
        if(condition) add(element);
        return true;
    }

    public boolean iterator() {
        for (String element : elements) {
            System.out.println(element);
        }
        return true;
    }

    private void createNewArray() {
        String[] newArray = new String[elements.length * 2];

        if(getSize() >= 0) System.arraycopy(elements, 0, newArray, 0, getSize());
        elements = newArray;
    }
}
