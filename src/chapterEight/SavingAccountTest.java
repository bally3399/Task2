package chapterEight;

public class SavingAccountTest {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);


        SavingsAccount.setAnnualInterestRate(0.04);
        System.out.println("Initial Savings Balances:");
        displaySavingsInfo(saver1);
        displaySavingsInfo(saver2);

        for (int month = 0; month < 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }


        System.out.println("\nSavings Balances after 12 Months:");
        displaySavingsInfo(saver1);
        displaySavingsInfo(saver2);

        SavingsAccount.setAnnualInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nSavings Balances after 1 more month with new interest rate:");
        displaySavingsInfo(saver1);
        displaySavingsInfo(saver2);

    }


    private static void displaySavingsInfo(SavingsAccount account) {
        System.out.printf("Savings Balance: $%.2f%n", account.getSavingsBalance());
    }
}
