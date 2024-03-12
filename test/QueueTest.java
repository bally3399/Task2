import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testThatQueueIsEmpty(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addElementToQueueTest(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());

        queue.add("G-String");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void addOneElement_removeOneElement_queueIsEmpty(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());

        queue.add("G-String");
        queue.remove("G-String");

        assertTrue(queue.isEmpty());
    }

    @Test
    public void addTwo_removeOneTest(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());

        queue.add("G-String");
        queue.add("F-String");

        queue.remove("G-String");
        assertFalse(queue.isEmpty());
    }
    @Test
    public void addThreeElementTest(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());

        queue.add("G-String");
        queue.add("F-String");
        queue.add("K-String");

        assertTrue(queue.isFull());
    }
}
