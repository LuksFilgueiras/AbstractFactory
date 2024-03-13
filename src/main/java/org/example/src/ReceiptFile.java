package org.example.src;

import  java.io.File;

public class ReceiptFile {

    private static int id;
    Sale sale;

    public ReceiptFile(Sale sale){
        id++;
        this.sale = sale;
    }

    public void printContent(){

    }
}
