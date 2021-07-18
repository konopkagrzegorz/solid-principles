package com.epam.prejap.isp.example1;

public class StandardPrinter implements Printer {

    @Override
    public void print(Document document) {
        System.out.println("Printing:\n" + document.getText());
    }
}
