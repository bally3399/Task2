package oop3;

import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void testCustomer(){
        ShoppingCart cart = new ShoppingCart();
        Address address = new Address("Akure","Nigeria", "101","idanre", "Ondo State");
        CardInformation cardInfo = new CardInformation("22", "10", "4819119", "CardType", CardType.VISA_CARD);
        BillingInformation billingInformation = new BillingInformation("08105795528", "bally", address, cardInfo);

    }
}
