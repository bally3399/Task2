package JavaScript;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InputAndOutputTest {
    @Test
    public void inputAndOutputTest(){
        int[] array = {2, 4, 5, 7, 8};
        int[] expected = {6};
        assertArrayEquals(expected, InputAndOutput.differences(array));
    }
    @Test
    public void inputAndOutput2Test(){
        int[] array = {2, 1, 3, 4, 9};
        int[] expected = {8};
        assertArrayEquals(expected, InputAndOutput.differences(array));
    }

}