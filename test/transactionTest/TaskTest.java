package transactionTest;

import org.junit.jupiter.api.Test;
import transaction.Task;
import transaction.Transaction;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static transaction.Task.date;
import static transaction.Task.startDateAndEndDate;

public class TaskTest {
    @Test
    public void test() throws IOException {
        BigDecimal expected = BigDecimal.valueOf(6000);
        String input = ("C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\transaction\\Transaction1.json");
        assertEquals(expected, Task.calculateTotal(input));
    }


    @Test
    public void test2() throws IOException {
        String input1 = "2024-05-13";
        String input = ("C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\transaction\\Transaction1.json");
        List<Transaction> expected = date(input,input1);
        assertEquals(3, expected.size());
    }

    @Test
    public void test3() throws IOException {
        String input1 = "2024-05-01";
        String input2 = "2024-05-13";
        String input = ("C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\transaction\\Transaction1.json");
        List<Transaction> expected = startDateAndEndDate(input, input1, input2);
        assertEquals(5, expected.size());
    }

    @Test
    public void test4() throws IOException {
        double expected = 2000.0;
        String input1 = "2024-05-01";
        String input2 = "2024-05-13";
        String input = ("C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\transaction\\Transaction1.json");
        assertEquals(expected, Task.calculateAverage(input, input1, input2));
    }
}



