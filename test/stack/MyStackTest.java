package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    @Test
    public void testThatMyStackIsEmpty(){
        MyStack myStack = new MyStack(4);
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void addX_stackIsNotEmpty(){
        MyStack myStack = new MyStack(4);
        assertTrue(myStack.isEmpty());
        myStack.push(4);
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void addX_removeX_stackIsEmpty(){
        MyStack myStack = new MyStack(4);
        assertTrue(myStack.isEmpty());
        myStack.push(4);
        myStack.pop(3);
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void addXYZ_removeZ_stackIsNotEmpty(){
        MyStack myStack = new MyStack(4);
        assertTrue(myStack.isEmpty());
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        myStack.pop(1);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void popElement_ThrowExceptionIfTheStackIsEmpty(){
        MyStack myStack = new MyStack(0);
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class,()-> myStack.pop(1));
    }

    @Test
    public void pushElement_ThrowExceptionIfTheStackIsFull(){
        MyStack myStack = new MyStack(4);
        assertTrue(myStack.isEmpty());
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        assertThrows(StackOverflowError.class,()->myStack.push(5));
    }
}
