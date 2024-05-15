package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
    public static int func(String number) throws IOException {
        Path path = Paths.get(number);
        String fileName = Files.readString(path);
        int digit = 0;
        for(Character character : fileName.toCharArray()){
            if(character.toString().matches("\\d")){
                digit++;
            }
        }
        return digit;
    }

    public static int func2(String word) throws IOException {
        Path path = Paths.get(word);
        String fileName = Files.readString(path);
        int sentence = 0;

        for(Character character : fileName.toCharArray()){
            if(character.toString().matches("\\b[^\\sAEIOUaeiou]*[aeiouAEIOU]")){
                sentence++;
            }
        }
        return sentence;
    }
    public static int func3(String word) throws IOException {
        Path path = Paths.get(word);
        String fileName = Files.readString(path);
        int sentence = 0;

        for(Character character : fileName.toCharArray()){
            if(character.toString().matches("(\\.)")){
                sentence++;
            }
        }
        return sentence;
    }
}

