package chapter17.stream;

import java.util.List;
import java.util.stream.IntStream;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        var stats = numbers.stream()
                            .limit(2)
                            .toList();
        System.out.println(stats);
    }
}

