package org.example.abstractfactory;

import org.example.src.Product;
import org.example.src.ReceiptFile;
import org.example.src.Sale;

import java.util.List;

public class ReceiptDebitCard implements Receipt{

    Integer cardNumber;
    public ReceiptDebitCard(Integer cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public String GenerateReceipt(Sale sale) {
        return "Receipt on Debit Card";
    }
}
