package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Set<Object> duplicates = new HashSet<>();
        duplicates.add("1");
        duplicates.add("2");
        duplicates.add(1);
        System.out.println(duplicates);

        Object[] num = {1,"esther", 'A', 0.5};
        System.out.println(Arrays.toString(num));

    }
}
