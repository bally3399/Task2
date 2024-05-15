package chapter15.Stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriter {
    public static void main(String[] args) {
        try(OutputStreamWriter os = new OutputStreamWriter(System.out);
            BufferedWriter bw = new BufferedWriter(os)){
            os.write("Hello World");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
