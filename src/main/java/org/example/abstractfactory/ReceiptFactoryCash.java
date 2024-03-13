package org.example.abstractfactory;

public class ReceiptFactoryCash implements ReceiptFactory {
    @Override
    public Receipt createReceipt() {
        return new ReceiptCash();
    }
}
