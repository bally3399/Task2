package chapter17.Stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static chapter17.stream.StreamOperations.*;
import static org.junit.jupiter.api.Assertions.*;

public class StreamOperationsTest {
    @Test
    public void testGetEvenNumbers() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> number2 = getEvenNumbersOf(number);

        assertNotNull(number2);
        assertEquals(5, number2.size());
    }

    @Test
    public void testMapCodePointToCharacter() {
        List<Integer> codePoint = List.of(65, 97, 98, 66, 69,48);
        Map<Integer, String> mapPoint = mapCodePointToCharacter(codePoint);
        assertNotNull(mapPoint);
        Map<Integer, String> expected = Map.of(
                65, "A",
                97, "a",
                98, "b",
                66, "B",
                69, "E",
                48, "0"
        );
        assertEquals(expected, mapPoint);
    }
    @Test
    public void testMapCodePointToCharacter1() {
        List<Integer> codePoint = List.of(65, 97, 98, 66, 69,48);
        Map<Integer, String> mapPoint = mapCodePointToCharacter1(codePoint);
        assertNotNull(mapPoint);
        Map<Integer, String> expected = Map.of(
                65, "A",
                97, "a",
                98, "b",
                66, "B",
                69, "E",
                48, "0"
        );
        assertEquals(expected, mapPoint);
    }

    @Test
    public void testToGetNumberFormatter() {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10);
        String result = getNumbersFormatted(number);

        String expected = "[1,2,3,4,5,6,7,8,9,10]";
        assertNotNull(result);
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertEquals(expected, result);
    }



}
