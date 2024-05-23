package chapter17.stream;

import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 2,4, 9, 7, 3, 8, 9, 6, 5);
        numbers.stream()//[10, 4, 7, 1, 2,4, 9, 7, 3, 8, 9, 6, 5]
                .map((number) ->String.format("number =  %d", number))// [numbers = 10, numbers = 4....]
                .forEach(System.out::println);
    }
}

