package chapter15.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample3.txt";
        try(FileWriter fileWriter = new FileWriter(fileLocation)){
            String word = "Hello World";
            fileWriter.write(word);
        }catch (IOException e){
            System.err.println();
        }
    }
}
