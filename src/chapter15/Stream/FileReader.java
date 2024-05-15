package chapter15.Stream;

import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaCode\\src\\chapter15\\Stream\\sample3.txt";
        char[] fileChar = new char[1024];
        try(java.io.FileReader fileReader = new java.io.FileReader(location)){
            int length = fileReader.read(fileChar);
            for(int counter=0;counter<length;counter++){
                System.out.print(fileChar[counter]);
            }
        }catch(IOException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
