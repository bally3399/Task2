package chapter17.stream;

import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
        String word = "Hello";
        IntStream intStream = word.chars();
        intStream.forEach(System.out::println);


        String word2 = "Hello World";
        word2.chars()
        .filter((number) -> number > 100).map((number) -> number * number)
                .forEach(System.out::println);

        String word3 = "Hello";
        Boolean result = word3.chars()
                .filter((number) -> number > 100)
                .mapToObj((number) -> Boolean.TRUE)
                .reduce(false, (first, second) -> first != second);
        System.out.println(result);
    }


}

