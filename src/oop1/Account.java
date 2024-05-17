package oop1;

public class Account {
    private final String name;
    private int balance = 0;
    private final String pin;
    private int number;

    public Account(String name, String pin, int number) {
        this.name = name;
        this.pin = pin;

        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void deposit(int amount) {
        if (!(amount > 0))throw new InvalidAmountException("Amount must be positive.");
        balance += amount;


    }

    public void withdraw(int amount, String pin) {
        if (!(this.pin.equals(pin))) throw new InvalidPinException("Invalid pin");
        if (!(amount > 0 && balance >= amount)) throw new InsufficientFundsException("Insufficient balance");
        balance -= amount;


    }
    public boolean validatePin(String pin) {
        return !this.pin.equals(pin);
    }

    public int checkBalance(String Pin) {
        if (pin.equals(Pin)) {
            return balance;
        } else {
            throw new InvalidPinException("Enter valid pin");
        }
    }
}
