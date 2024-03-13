package org.example.abstractfactory;

public class ReceiptFactoryCreditCard implements ReceiptFactory {

    Integer cardNumber;
    public ReceiptFactoryCreditCard(Integer cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public Receipt createReceipt() {
        return new ReceiptCreditCard(cardNumber);
    }
}
