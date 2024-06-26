package oop1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final List<Account> accounts = new ArrayList<>();
    private int counter = 100;

    public Bank(String name) {
        this.name = name;
    }


    public Account registerCustomer(String firstName, String lastName, String pin) {
        Account account = new Account(firstName + " " + lastName, pin, generateAccountNumber());
        accounts.add(account);
        return account;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account findAccount(int accountNumber){
        for (Account account:accounts) {
            if(account.getNumber()== accountNumber)
                return account;
            
        }
        return null;

    }

    public void deposit(int accountNumber, int amount){
        Account account = findAccount(accountNumber);
        if (account != null) account.deposit(amount);
    }
    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);

        if (account.validatePin(pin)) {
            throw new InsufficientFundsException("Invalid PIN");
        }

        account.withdraw(amount, "1234");
    }

    public int checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public void removeAccount(int accountNumber, String pin){
        Account account = findAccount(accountNumber);
        account.validatePin(pin);
        accounts.remove(account);
    }

    public void transfer(int amount, int myNumber, int number, String pin) {
        Account account = findAccount(myNumber);
        Account receiverAccount = findAccount(number);

        if (account.validatePin(pin)) {
            throw new InvalidPinException("Invalid pin");
        }

        account.withdraw(amount, pin);
        receiverAccount.deposit(amount);
    }
    public int generateAccountNumber() {
        return counter++;
    }


}
