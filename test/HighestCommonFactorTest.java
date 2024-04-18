import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestCommonFactorTest {

    @Test
    public void testForHighestCommonFactor() {
        int[] array = {2, 6, 8};
        int result = HighestCommonFactor.HighestCommon(array);
        int expected = 2;
        assertEquals(expected, result);

    }
    @Test
    public void testForHighestCommonFactor1() {
        int[] array = {6, 9, 12};
        int result = HighestCommonFactor.HighestCommon(array);
        int expected = 3;
        assertEquals(expected, result);

    }
}
