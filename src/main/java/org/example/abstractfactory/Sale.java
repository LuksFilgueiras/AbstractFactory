package org.example.abstractfactory;

public class Sale {
    private Receipt receipt;
    public Sale(ReceiptFactory receiptFactory){
        this.receipt = receiptFactory.createReceipt();
    }

    public String generateReceipt(){
        return receipt.GenerateReceipt();
    }
}
