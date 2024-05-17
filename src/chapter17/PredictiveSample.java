package chapter17;

import java.util.function.Predicate;

public class PredictiveSample {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = (word) -> {
            return word;
        };
        System.out.println(predicate.test(true));
    }
}
