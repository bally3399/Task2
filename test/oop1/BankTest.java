package oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    @Test
    public void registerCustomerTest(){
        Bank bank = new Bank("name");

        Account account = bank.registerCustomer("Bally", "Sulaiman", "1234");

        assertEquals(1, bank.getAccounts().size());

    }
    @Test
    public void findAccountTest()  {
        Bank bank = new Bank("firstBank");

        Account account = bank.registerCustomer("Bally", "Sulaiman", "1234");

        assertEquals(1, bank.getAccounts().size());

        Account foundAccount = bank.findAccount(100);
        assertEquals("Bally Sulaiman", foundAccount.getName());

    }
    @Test
    public void depositTest() {
        Bank bank = new Bank("firstBank");

        Account account = bank.registerCustomer("Esther", "Tobiloba", "1234");

        bank.deposit(account.getNumber(), 1_000);

        assertEquals(1_000, account.getBalance());
    }
    @Test
    public void depositTwiceTest() {
        Bank bank = new Bank("firstBank");

        Account account = bank.registerCustomer("Praise", "Oyewole", "1245");

        bank.deposit(account.getNumber(), 5_000);
        bank.deposit(account.getNumber(), 4_000);

        assertEquals(9_000, account.getBalance());

    }
    @Test
    public void withdrawNegativeAmount_BalanceRemainsUnchanged() {
        Bank bank = new Bank("firstBank");
        Account account = bank.registerCustomer("Esther", "Tobiloba", "1234");

        assertThrows(InsufficientFundsException.class, () -> bank.withdraw(account.getNumber(), -1000, "1234"));
        assertEquals(0, account.getBalance());
    }



    @Test
    public void withdrawAmountGreaterThanBalanceThrowsInsufficientFundsException() {
        Bank bank = new Bank("firstBank");

        Account account = bank.registerCustomer("Esther", "Tobiloba", "1234");

        bank.deposit(account.getNumber(), 500);

        assertThrows(InsufficientFundsException.class, () -> bank.withdraw(account.getNumber(), 1000, "1234"));

        assertEquals(500, account.getBalance());
    }


    @Test
    public void withdrawTest() {
        Bank bank = new Bank("firstBank");

        Account account = bank.registerCustomer("Esther", "Tobiloba", "1234");

        bank.deposit(account.getNumber(), 2_000);

        bank.withdraw(account.getNumber(),1_000, "1234");

        assertEquals(1_000, account.getBalance());

    }

    @Test
    public void checkBalance(){
        Bank bank = new Bank("firstBank");

        Account account = bank.registerCustomer("Bally","Sulaiman", "1234");

        bank.checkBalance(account.getNumber(), "1234");

        assertEquals(0, account.getBalance());
    }

    @Test
    public void removeAccountTest() {
        Bank bank = new Bank("firstBank");
        Account account = bank.registerCustomer("Bally", "Sulaiman", "1234");
        assertEquals(1, bank.getAccounts().size());

        bank.removeAccount(account.getNumber(), "1234");

        assertEquals(0, bank.getAccounts().size());

    }

    @Test
    public void deposit1k_transfer5h_myBalanceRemains5hTest(){
        Bank bank = new Bank("firstBank");

        Account account1 = bank.registerCustomer("firstName", "LastName", "1234");
        Account account2 = bank.registerCustomer("firstName", "LastName", "5678");

        account1.deposit(1000);

        bank.transfer(account1.getNumber(), account2.getNumber(),500, "1234");

        assertEquals(500, account1.getBalance());
        assertEquals(500, account2.getBalance());
    }

}