package chapter16;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class lambdaExample {
    public static void main(String[] args) {
        Comparator<Transaction> comparator = (previousTransaction, nextTransaction)-> nextTransaction.getAmount().compareTo(previousTransaction.getAmount());
        Set<Transaction> transaction =new TreeSet<>();
        transaction.add(new Transaction());
        transaction.add(new Transaction());
        transaction.add(new Transaction());

    }

}
