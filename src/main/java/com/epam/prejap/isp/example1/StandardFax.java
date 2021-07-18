package com.epam.prejap.isp.example1;

public class StandardFax implements Fax {

    @Override
    public void sendDocument(Document document) {
        System.out.println("Sending:\n" + document.getText());
    }
}
