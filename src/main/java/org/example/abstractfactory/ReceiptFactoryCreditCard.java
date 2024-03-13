package org.example.abstractfactory;

public class ReceiptFactoryCreditCard implements ReceiptFactory {
    @Override
    public Receipt createReceipt() {
        return new ReceiptCreditCard();
    }
}
