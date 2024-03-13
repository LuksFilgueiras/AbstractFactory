package org.example.abstractfactory;

public class ReceiptCreditCard implements Receipt{
    @Override
    public String GenerateReceipt() {
        return "Receipt on Credit Card";
    }
}
