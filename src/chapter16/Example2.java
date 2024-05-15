package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                1, "One" ,
                2  , "Two" ,
                3  , "Three" ,
                4  , "Four");

        System.out.println(map);
    }
}
