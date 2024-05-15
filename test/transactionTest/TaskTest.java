package transactionTest;

import org.junit.jupiter.api.Test;
import transaction.Task;

import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void test() throws IOException {
        BigDecimal expected = BigDecimal.valueOf(6000);
        String input = ("C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\transaction\\Transaction1.json");
        assertEquals(expected, Task.calculateTotal(input));
    }
}
