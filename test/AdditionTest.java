import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    @Test
    public void testAddition() {
        assertEquals(30,Addition.add(15, 15));
    }
    @Test
    public void testAddition1() {
        assertEquals(0,Addition.add(-15, 15));

    }
}
