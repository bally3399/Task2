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

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");
        map2.put(4, "Four");

        System.out.println(map2);
    }
}
