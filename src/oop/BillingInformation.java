package oop;

public class BillingInformation {
    private String phoneNumber;
    private String receiverName;
    private String deliveryAddress;
    private CardInformation creditCardInfo;

    public BillingInformation(String phoneNumber, String receiverName, String deliveryAddress, CardInformation creditCardInfo) {
        this.phoneNumber = phoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInfo = creditCardInfo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CardInformation getCreditCardInfo() {
        return creditCardInfo;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCreditCardInfo(CardInformation creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
}

