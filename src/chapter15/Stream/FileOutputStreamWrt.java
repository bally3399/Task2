package chapter15.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamWrt {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample3.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation, true)){
            String data = "\nInvest your money wisely";
            fileOutputStream.write(data.getBytes());
        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Error" + e.getMessage());
        }
    }
}
