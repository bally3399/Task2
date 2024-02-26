import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillFourTest {
    @Test
    public void testThatChangeEvenIndexToZeroAndChangeOddNumbersToOne(){
        FireDrillFour fireDrill = new FireDrillFour();

        int[] array = {4, 5, 8, 8, 2, 9};

        int[] result = fireDrill.ZeroAndOneNumbers(array);

        int[] expected = {0, 1, 0, 0, 0, 1};

        assertArrayEquals(expected, result);

    }

}
