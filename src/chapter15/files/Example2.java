package chapter15.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\DELL\\Documents\\Chapter3");

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            Files.createFile(Paths.get("C:\\Users\\DELL\\Documents\\Chapter3\\sample.txt"));
            directoryStream.forEach(System.out::println);
        }catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
