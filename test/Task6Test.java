import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @Test
    public void testString() {
        String word = "It is still a beautiful world";
        String expected = "world beautiful a still is It";
        String result = Task6.reverseString(word);
        assertEquals(expected, result);
    }
}
