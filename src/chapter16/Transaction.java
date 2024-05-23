package chapter16;

public class Transaction implements Comparable<Transaction>{
    @Override
    public String toString() {
        return "Transaction{" +
                "amount='" + amount + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    private String amount;
    private String accountNumber;

    public Transaction(String amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public Transaction() {

    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}
