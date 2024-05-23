package chapter17.stream;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY", "ASDEG", "ABCDEFF", "ABC");
        numbers.stream().map(String::length)
                .forEach(System.out::println);

    }
}

