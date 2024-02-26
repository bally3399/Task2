import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FireDrillFiveTest {

    @Test
    public void testThatChangeEvenIndexToFalseAndChangeOddNumbersToTrueTest(){
        FireDrillFive fireDrill = new FireDrillFive();

        int[] array = {4, 5, 8, 8, 2, 9};

        boolean[] expected = {false, true, false, false, false, true};

        assertArrayEquals(expected, fireDrill.replaceEvenNumberWithFalseAndReplaceOddNumbersWithTrue(array));

    }
    @Test
    public void test(){
        FireDrillFive fireDrillFive = new FireDrillFive();
        int[] array = new int[10];
        assertArrayEquals(array, fireDrillFive.number());
    }
}
