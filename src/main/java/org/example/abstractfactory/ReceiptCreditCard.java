package org.example.abstractfactory;

import org.example.src.Sale;

public class ReceiptCreditCard implements Receipt{

    Integer cardNumber;

    public ReceiptCreditCard(Integer cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public String GenerateReceipt(Sale sale) {
        return "Receipt on Credit Card";
    }
}
