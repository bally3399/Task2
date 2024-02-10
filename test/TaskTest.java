import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void testAnArrayLength_returnDoubleLength(){
        int[] array = {4, 5, 6, 8};

        int[] result = Task.doubleLength(array);

        int[] expected = {4, 5, 6, 8, 8, 10, 12, 16};

        assertArrayEquals(expected, result);
        
        
    }
}
