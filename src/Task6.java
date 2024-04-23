import java.util.ArrayList;

public class Task6 {
    public static String reverseString(String word) {
//        StringBuilder reversed = new StringBuilder();
//        int length = word.length();
//        for (int index = word.length() - 1; index >= 0; index--) {
//            if (word.charAt(index) == ' ' || index == 0) {
//                int idx = (index == 0) ? 0 : index + 1;
//                String word1 = word.substring(idx, length);
//                reversed.append(word1);
//                if (index > 0) {
//                    reversed.append(" ");
//                }
//                length = index;
//            }
//        }
//        return reversed.toString();
        word = word.trim();
        String[] words = split(word);
        String reversed = "";
        for (int index = words.length - 1; index >= 0; index--) {
           reversed += words[index] + " ";
        }
        return reversed.trim();
    }

    private static String[] split(String word) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) != ' ') str += word.charAt(index);
            if (word.charAt(index) == ' ') {
                list.add(str);
                str = "";
            }
        }
        list.add(str);
        return list.toArray(new String[0]);
    }
}
