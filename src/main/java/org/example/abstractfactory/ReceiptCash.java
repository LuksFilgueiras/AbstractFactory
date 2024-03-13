package org.example.abstractfactory;

import org.example.src.Product;
import org.example.src.ReceiptFile;
import org.example.src.Sale;

import java.util.List;

public class ReceiptCash implements Receipt{
    @Override
    public String GenerateReceipt(Sale sale) {
        return "Receipt on Cash";
    }
}
