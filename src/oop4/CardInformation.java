package oop4;

public class CardInformation {
    private String cvv;
    private String cardExpirationDate;
    private String creditCardNumber;
    private String cardName;
    private final CardType cardType;

    public CardInformation(String cvv, String cardExpirationDate, String creditCardNumber, String cardName, CardType cardType) {
        this.cvv = cvv;
        this.cardExpirationDate = cardExpirationDate;
        this.creditCardNumber = creditCardNumber;
        this.cardName = cardName;
        this.cardType = cardType;
    }

}
