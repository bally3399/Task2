package stack;

public class MyStack {
    private int size;
    public MyStack(int size) {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        if(size > 4) throw new StackOverflowError("Error");
        ++size;
    }

    public void pop(int element) {
        if(isEmpty()) throw new IllegalArgumentException("ArrayIndexOutOfBoundsException");
        --size;
    }
}
