import java.util.Arrays;
import java.util.Objects;

public class MyList {
    private int numberOfElement;
    private String[] elements = new String[3];
    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void add(String element) {
        elements[numberOfElement] = element;
        numberOfElement++;
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

    public String get(int index) {
        return elements[index -1];
    }

    public int getIndex(String element) {
        for(int index = 0; index < elements.length; index++){
            if(elements[index].equals(element)) return index;
        }
        return 0;
    }

    public boolean contain(String element) {
        boolean condition = false;
        for(String string : elements) {
            if(Objects.equals(string, element)){
                condition = true;
                break;
            }
        }
        return condition;
    }

    public int getSize() {
        return numberOfElement;
    }

    public boolean copy(String element) {
        for (String s : elements) {
            if (s != null && s.equals(element)) {
                return true;
            }
        }
            return false;
    }
}
