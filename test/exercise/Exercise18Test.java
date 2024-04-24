package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise18Test {
    @Test
    public void test() {
        int[] array = {5, 2, 3, 1,2};
        int[] expected = {5, 2, 3, 1, 3};
        int[] result = Exercise18.addToLastIndex(array);
        assertArrayEquals(expected, result);
    }
    @Test
    public void test1() {
        int[] array = {2, 4, 0, 9, 9};
        int[] expected = {2, 4, 1, 0, 0};
        int[] result = Exercise18.addToLastIndex(array);
        assertArrayEquals(expected, result);
    }
}
