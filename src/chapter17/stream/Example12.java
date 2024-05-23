package chapter17.stream;

import java.util.List;
import java.util.stream.Stream;

public class Example12 {
    public static void main(String[] args) {
        List<String> lists = List.of(
                "ABCD", "EFGHIJ", "KLMNOPD"
        );

        System.out.println(lists.stream()
                .flatMap((element) ->
                        Stream.of(new StringBuilder(element).reverse()))
                .toList());
    }
}

