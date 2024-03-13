package abstractfactory;

import org.example.abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTest {
    @Test
    void generateCreditCardReceipt() {
        ReceiptFactory receiptFactory = new ReceiptFactoryCreditCard();
        Sale sale = new Sale(receiptFactory);
        assertEquals("Receipt on Credit Card", sale.generateReceipt());
    }

    @Test
    void generateDebitCardReceipt() {
        ReceiptFactory receiptFactory = new ReceiptFactoryDebitCard();
        Sale sale = new Sale(receiptFactory);
        assertEquals("Receipt on Debit Card", sale.generateReceipt());
    }

    @Test
    void generateCashReceipt() {
        ReceiptFactory receiptFactory = new ReceiptFactoryCash();
        Sale sale = new Sale(receiptFactory);
        assertEquals("Receipt on Cash", sale.generateReceipt());
    }
}
