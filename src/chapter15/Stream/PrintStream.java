package chapter15.Stream;

import java.io.IOException;

public class PrintStream {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample.txt";
        try (java.io.PrintStream printStream = new java.io.PrintStream(fileLocation)){
            printStream.println("Hello World");

        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
