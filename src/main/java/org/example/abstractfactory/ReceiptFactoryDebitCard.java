package org.example.abstractfactory;

public class ReceiptFactoryDebitCard implements ReceiptFactory {

    Integer cardNumber;
    public ReceiptFactoryDebitCard(Integer cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public Receipt createReceipt() {
        return new ReceiptDebitCard(cardNumber);
    }
}
