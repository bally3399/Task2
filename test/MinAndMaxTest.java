import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinAndMaxTest {
    @Test
    public void testThatMethodCanTakeArrayOfNumbers(){
        int[] expected = {10, 14};
        int[] numbers = {3, 4, 2, 5, 1};
        assertArrayEquals(expected, MinAndMax.getMinAndMax(numbers));
    }
}
