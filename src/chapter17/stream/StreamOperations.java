package chapter17.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toMap;

public class StreamOperations {
    public static List<Integer> getEvenNumbersOf(List<Integer> list) {
        return list.stream()
                .filter((number) -> number %2 == 0)
                .collect(Collectors.toList());
    }

    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoint) {
        return codePoint.stream()
                .collect(toMap((number) ->number, Character:: toString));
    }

    public static Map<Integer, String> mapCodePointToCharacter1(List<Integer> codePoint) {
        return codePoint.stream()
                .collect(toMap((number) ->number, Character:: toString, (a, b) -> a));
    }

    public static String getNumbersFormatted(List<Integer> number) {
        return number.stream()
                .map((numbers -> numbers + ""))
                .collect(Collectors.joining("," ,"[","]" ));
    }

}
