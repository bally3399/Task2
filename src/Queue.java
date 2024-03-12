public class Queue {
    private int numberOfElement;
    private String[] elements = new String[3];

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void add(String element) {
        if(getSize() == elements.length) elements[numberOfElement] = element;
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

       public int getSize(){
        return numberOfElement;
       }

    public boolean isFull() {
        elements  = new String[3];
        return true;

    }
}
