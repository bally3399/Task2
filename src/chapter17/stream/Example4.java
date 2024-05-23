package chapter17.stream;

import chapter16.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Transaction> numbers = List.of(new Transaction("$1000", "12345678"),
                new Transaction("$15600", "12345678"),
                new Transaction("$5000", "123456789"));

        numbers.stream()
                .filter((transaction) ->  new BigDecimal(transaction.getAmount()
                        .substring(1))
                        .compareTo(new BigDecimal(100))> 0)
                .forEach(System.out::println);
    }
}

