package file;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileTest {
    @Test
    public void test() throws IOException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\file\\file.txt";
        int expected = 2;
        assertEquals(expected, File.func(location));
    }

    @Test
    public void test2() throws IOException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\file\\file.txt";
        int expected = 5;
        assertEquals(expected, File.func2(location));
    }
    @Test
    public void test3() throws IOException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\file\\file.txt";
        int expected = 2;
        assertEquals(expected, File.func3(location));
    }
}
