import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task4Test {
    @Test
    public void findTheMostOccurenceNumberInAListTest(){
        int[] number = {1, 2, 2, 3, 4, 2};
        int[] expected = {3,2};
        assertArrayEquals(expected, Task4.highestNumber(number));
    }
    @Test
    public void findTheMostOccurenceNumberInAListTest1(){
        int[] number = {2, 3, 3, 5, 6, 7};
        int[] expected = {2, 3};
        assertArrayEquals(expected, Task4.highestNumber(number));
    }
}
