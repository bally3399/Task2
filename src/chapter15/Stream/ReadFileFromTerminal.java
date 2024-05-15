package chapter15.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ReadFileFromTerminal {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
            System.out.print("Enter your data: ");
            String data = bufferedReader.readLine();
            System.out.println("You entered: "+data);
        }catch (IOException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}
