package chapter15.Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleOnPath {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample4.txt";
        Path path = Paths.get(location);
    try {
        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("Happy married life bj");
        writer.close();
    }catch (IOException e){
        System.err.println(e.getMessage());
    }

    }
}
