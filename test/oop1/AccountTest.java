package oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositNegativeBalance_balanceRemainsUnchanged() {
        Account account = new Account(null, "1234", 0);
        assertThrows(InvalidAmountException.class, () -> account.deposit(-50_000));
    }


    @Test
    public void depositPositiveAmount_balanceIncreaseTest() {
        Account account = new Account(null, null, 0);
        assertEquals(0, account.getBalance());
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreaseTest() {
        Account account = new Account(null, null, 0);
        assertEquals(0, account.getBalance());

        account.deposit(2_000);
        account.deposit(4_000);

        assertEquals(6_000, account.getBalance());
    }

    @Test
    public void withdrawNegativeAmount_balanceRemainsUnchanged() {
        Account account = new Account(null, "1234", 0);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(-50_000, "1234"));
    }

    @Test
    public void withdrawPositiveBalanceTest() {
        Account account = new Account(null, "1234", 0);
        assertEquals(0, account.getBalance());

        account.deposit(1200);
        account.withdraw(1000, "1234");

        assertEquals(200, account.getBalance());

    }

    @Test
    public void withdrawNegativeBalance_balanceRemainsUnchanged() {
        Account account = new Account(null, "1234", 0);
        assertEquals(0, account.getBalance());

        account.deposit(200);

        assertThrows(InsufficientFundsException.class, () -> account.withdraw(-50_000, "1234"));
        assertEquals(200, account.getBalance());
    }

    @Test
    public void withdrawNegativeBalanceTwice_balanceRemainsUnchanged() {
        Account account = new Account(null, "1234", 0);
        assertEquals(0, account.getBalance());

        account.deposit(200);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(-1_000, "1234"));
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(-5_000, "1234"));

        assertEquals(200, account.getBalance());

    }

    @Test
    public void checkAccountBalance() {
        Account account = new Account(null, "1234", 0);
        account.checkBalance("1234");
        assertEquals(0, account.getBalance());
    }

    @Test
    public void checkAccountBalanceAfterDeposit_accountBalanceChange() {
        Account account = new Account(null, "1234", 0);

        account.deposit(1_000);
        account.checkBalance("1234");

        assertEquals(1_000, account.getBalance());
    }
}


