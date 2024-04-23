import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HighestElementTest {
    @Test
    public void testHighestElement() {
        int[] array = {-10};
        assertThrows(IllegalArgumentException.class, ()->HighestElement.multiplicationOfTwoElement(array));

    }
    @Test
    public void testHighestElement2() {
        int[] array = {-5, 4, 9, -10, 2};
        int expected = 50;
        int result = HighestElement.multiplicationOfTwoElement(array);
        assertEquals(expected, result);
    }

    @Test
    public void testMovingZeroToTheEndOfArray(){
        int[] array = {0, 0, 3, 2, -1, 7, 8};
        int[] expected = {3, 2, -1, 7, 8, 0, 0};
        int[] result = HighestElement.movingZeroInElementToTheLastIndex(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMovingZeroToTheEndOfArray2(){
        int[] array = {3, 2, 0, -1, 7, 0, 8, 0, 1, 0};
        int[] expected = {3, 2, -1, 7, 8, 1, 0, 0, 0, 0};
        int[] result = HighestElement.movingZeroInElementToTheLastIndex(array);
        assertArrayEquals(expected, result);
    }

}
