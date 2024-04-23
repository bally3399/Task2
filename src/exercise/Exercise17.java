package exercise;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isPalindrome = true;
        for(int index = 0; index < str.length() / 2; index++) {
            if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    public static String isPalindrome(String letter) {
        boolean isPalindrome = true;
        for (int index = 0; index < letter.length() / 2; index++) {
            if (letter.charAt(index) != letter.charAt(letter.length() - 1 - index)) {
                isPalindrome = false;
            }
        }
        if(isPalindrome) {
            return "Yes";
        }else {
            return "No";
        }
    }
}
