package org.example.abstractfactory;

import org.example.src.ReceiptFile;
import org.example.src.Sale;

import java.util.List;

public interface Receipt {
    String GenerateReceipt(Sale sale);
}
