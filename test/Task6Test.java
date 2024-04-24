import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @Test
    public void testString() {
        String word = "It is still a beautiful world";
        String expected = "world beautiful a still is It";
        String result = Task6.reverseString(word);
        assertEquals(expected, result);
    }
    @Test
    public void testForPosition() {
        int[] array = {10, 3, 6};
        int[] expected = {3, 1, 2};
        int[] result = Task6.position(array);
        assertArrayEquals(expected, result);
    }
}
