package com.epam.prejap.isp.example1;

public class StandardScanner implements Scanner {

    @Override
    public void scan(Document document) {
        System.out.println("Scanning:\n" + document.getText());
    }
}
