package oop1;

import java.util.Scanner;
import javax.swing.*;

public class BankApp {
    private static final Bank bank = new Bank("firstBank");


    public static void main(String[] args) {
        display();
    }

    public static void display(){
        String display = """
            Welcome to First Bank App
            1.Create Account
            2.Close Account
            3.Deposit
            4.Transfer
            5.Withdraw
            6.Check balance
            7.Exit App
            """;
            String choice = input(display);
            switch (choice.charAt(0)) {
                case '1':
                    createAccount();
                case '2':
                    closeAccount();
                case '3':
                    deposit();
                case '4':
                    transfer();
                case '5':
                    withdraw();
                case '6':
                    checkBalance();
                case '7':
                    exitApp();
                default:
                    display();
            }
        }

    private static void exitApp() {
        System.exit(7);
    }

    private static void closeAccount() {
        String accountNumber = input("Enter the account number: ");
        String pin = input("Enter your pin: ");
        try{
            bank.removeAccount(Integer.parseInt(accountNumber), pin);
        }catch (Exception e){
            print(e.getMessage());
        }finally {
            exitApp();
        }
    }
    private static void createAccount() {
        String firstName = input("Enter your first name: ");
        String lastName = input("Enter your last name: ");
        String pin = input("Enter your pin: ");
        Account newAccount = bank.registerCustomer(firstName, lastName, pin);
        print("Account created successfully!");
        print("Your account number is:" + newAccount.getNumber());
        display();
    }




    private static void deposit() {
        String accountNumber = input("Enter your account number: ");
        String amount = input("Enter an amount: ");
        try {
            bank.deposit(Integer.parseInt(accountNumber), Integer.parseInt(amount));
            print("Deposit successful.");
        }catch (RuntimeException e){
            print(e.getMessage());
        }finally {
            display();
        }
    }

    private static String input(String display) {
        print(display);
        return JOptionPane.showInputDialog(null, display);
    }
    private static void print(String input){
        JOptionPane.showMessageDialog(null, input);

    }


    private static void transfer() {
        String amount = input("Enter transfer amount: ");
        String senderAccount = input("Enter your account number: ");
        String receiverAccount = input("Enter the receiving account number: ");
        String pin = input("Enter your pin: ");
        try {
            bank.transfer(Integer.parseInt(amount), Integer.parseInt(senderAccount), Integer.parseInt(receiverAccount), pin);
            print("Transfer successful");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            display();
        }
    }
    private static void withdraw() {
        String account = input("Enter your account number: ");
        String amount = input("Enter the amount: ");
        String pin = input("Enter your pin: ");
        try {
            bank.withdraw(Integer.parseInt(amount), Integer.parseInt(account), pin);
            print("Amount withdrawn successfully");
        }catch (Exception e){
            print(e.getMessage());
        }finally {
            display();
        }
    }
    private static void checkBalance() {
        int balance;
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin: ");
        try {
             balance = bank.checkBalance(Integer.parseInt(accountNumber), pin);
            print("Your balance is: " +"#"+ balance);

        }catch(Exception e){
            print(e.getMessage());
        }finally {
            display();
        }

    }

}


