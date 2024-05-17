package chapter16;

public class Transaction implements Comparable<Transaction>{
    private String amount;
    private String accountNumber;

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
