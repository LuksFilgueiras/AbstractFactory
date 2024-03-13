package org.example.abstractfactory;

public class ReceiptCash implements Receipt{
    @Override
    public String GenerateReceipt() {
        return "Receipt on Cash";
    }
}
