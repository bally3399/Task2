package chapter17.stream;

import chapter16.Transaction;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20, 30, 40, 50);
        Stream<Integer> stream = numbers.stream();
        stream.forEach(System.out::println);
        //stream.forEach(number -> System.out.println(number));


        Stream<Transaction> transactionStream = Stream.of(
                new Transaction("$1000", "1234"),
                new Transaction("$10000", "12345"));
        transactionStream.forEach((transaction) -> System.out.printf("account with id %s in it\n," +
                        transaction.getAmount(),
                        transaction.getAmount()));
        Stream<Integer> integerStream = Stream.generate(() -> new SecureRandom().nextInt()).limit(4);
        integerStream.forEach(System.out::println);
    }
}
