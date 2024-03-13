package org.example.abstractfactory;

public class ReceiptDebitCard implements Receipt{
    @Override
    public String GenerateReceipt() {
        return "Receipt on Debit Card";
    }
}
