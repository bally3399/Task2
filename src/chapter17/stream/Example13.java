package chapter17.stream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        double average = numbers.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .average().orElseThrow(() -> new RuntimeException("number not present"));
        System.out.println(average);

        List<Integer> number1 = List.of(10, 20, 30, 40, 50);
        var stats = number1.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .summaryStatistics();
        System.out.println(stats);
        stats.accept(10);
        System.out.println(stats);

        List<Integer> number2 = List.of(10, 20, 30, 40, 50);
        var add = number2.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .sum();
        System.out.println(add);
    }
}



