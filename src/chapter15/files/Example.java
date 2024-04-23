package chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        //try {
            // step1
            Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\files\\sample.txt");
            //step 2
            Files.exists(path);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
