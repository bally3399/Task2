package oop;

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

    public String getCvv() {
        return cvv;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public CardType getCardType() {
        return cardType;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
