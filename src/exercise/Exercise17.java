package exercise;

import java.util.Scanner;

public class Exercise17 {
    public static String isPalindrome(String letter) {
        boolean isPalindrome = true;
        for (int index = 0; index < letter.length() / 2; index++) {
            if (letter.charAt(index) != letter.charAt(letter.length() - 1 - index)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            return "Yes";
        }else {
            return "No";
        }
    }
}
