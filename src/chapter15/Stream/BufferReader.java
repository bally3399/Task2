package chapter15.Stream;

import java.io.*;
import java.util.stream.Collectors;

public class BufferReader {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample3.txt";
            try(FileInputStream fileInputStream = new FileInputStream(fileLocation)){
                InputStreamReader inputStreamReader = new InputStreamReader((fileInputStream));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                System.out.println(bufferedReader.lines().collect(Collectors.joining("\n")));
            } catch (IOException e) {
                System.err.println("Error" + e.getMessage());
            }
    }
}
