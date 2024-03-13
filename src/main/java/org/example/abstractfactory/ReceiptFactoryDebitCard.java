package org.example.abstractfactory;

public class ReceiptFactoryDebitCard implements ReceiptFactory {
    @Override
    public Receipt createReceipt() {
        return new ReceiptDebitCard();
    }
}
