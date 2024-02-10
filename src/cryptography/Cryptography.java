package cryptography;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        String originalNumber = scanner.nextLine();

        String encryptedNumber = encrypt(originalNumber);
        System.out.println("Encrypted number: " + encryptedNumber);

        String decryptedNumber = decrypt(encryptedNumber);
        System.out.println("Decrypted number: " + decryptedNumber);
    }

    public static String encrypt(String data){
        int firstDigit = Integer.parseInt(String.valueOf(data.charAt(0)));
        int secondDigit = Integer.parseInt(String.valueOf(data.charAt(1)));
        int thirdDigit = Integer.parseInt(String.valueOf(data.charAt(2)));
        int fourthDigit = Integer.parseInt(String.valueOf(data.charAt(3)));

        int digit1 = (firstDigit + 7) % 10;
        int digit2 = (secondDigit + 7) % 10;
        int digit3 = (thirdDigit + 7) % 10;
        int digit4 = (fourthDigit + 7) % 10;

        String result = "" + digit3 + digit4 + digit1 + digit2;
        return result;
    }

    public  static String decrypt(String encryptedNumber) {
        int firstDigit = Integer.parseInt(String.valueOf(encryptedNumber.charAt(0)));
        int secondDigit = Integer.parseInt(String.valueOf(encryptedNumber.charAt(1)));
        int thirdDigit = Integer.parseInt(String.valueOf(encryptedNumber.charAt(2)));
        int fourthDigit = Integer.parseInt(String.valueOf(encryptedNumber.charAt(3)));

        int digit1 = (firstDigit + 3) % 10;
        int digit2 = (secondDigit + 3) % 10;
        int digit3 = (thirdDigit + 3) % 10;
        int digit4 = (fourthDigit + 3) % 10;
        String decryptedNumber = "" + digit3 + digit4 + digit1 + digit2;
        return decryptedNumber;
    }
}
