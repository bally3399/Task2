package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositNegativeBalance_balanceRemainsUnchanged(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(-50_000);
        assertEquals(0, account.getBalance());

    }
    @Test
    public void depositPositiveAmount_balanceIncreaseTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreaseTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(2_000);
        account.deposit(4_000);
        assertEquals(6_000, account.getBalance());
    }
    @Test
    public void withdrawNegativeBalance_balanceRemainsUnchanged(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.withdraw(-20_000);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void withdrawPositiveBalance1_balanceRemainsUnchanged(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(1_200);
        account.withdraw(1_000);
        assertEquals(200, account.getBalance());
    }

    @Test
    public void withdrawNegativeBalance1_balanceRemainsUnchanged(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(200);
        account.withdraw(-50_000);
        assertEquals(200, account.getBalance());
    }

    @Test
    public void withdrawNegativeBalanceTwice_balanceRemainsUnchanged(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(200);
        account.withdraw(-1_000);
        account.withdraw(-5_000);
        assertEquals(200, account.getBalance());
    }


}
