package chapter15.Stream;

import java.io.IOException;
import java.io.PrintStream;

public class Example2 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample2.txt";
        try(PrintStream printStream = new PrintStream(fileLocation)) {
            System.setOut(printStream);
            System.out.println("Trying to be done");
        }catch (IOException e){
            System.err.println(e.getMessage());

        }
    }
}
