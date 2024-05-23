package chapter17.stream;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 2,4, 9, 7, 3, 8, 9, 6, 5);
        var result = numbers.stream()
                            .distinct()//take out the duplicate numbers.
                            .sorted()
                            .toList();

        System.out.println(result);

    }


}

