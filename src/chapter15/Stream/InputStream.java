package chapter15.Stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample3.txt";
        try(java.io.InputStream inputStream = new FileInputStream(fileLocation)) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte[] fileData = dataInputStream.readAllBytes();
            System.out.println(new String(fileData));
        }catch (IOException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
