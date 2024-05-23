package chapter17.stream;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        numbers.stream().filter((number) -> number % 2 != 0).forEach(System.out::println);


        List<Integer> number1 = List.of(10, 20, 30, 40, 50);
        number1.stream().filter((number) -> number % 2 == 0).forEach(System.out::println);
        System.out.println();

        List<Integer> num = List.of(10, 20, 35, 40, 50);
        num.stream().filter((number) -> number % 2 != 0).forEach(System.out::println);
    }
}

