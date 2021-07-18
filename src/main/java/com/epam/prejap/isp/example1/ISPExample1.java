package com.epam.prejap.isp.example1;

public class ISPExample1 {

    public static void main(String[] args) {
        Printer printer = new StandardPrinter();
        Fax fax = new StandardFax();
        Scanner scanner = new StandardScanner();

        Document document = new Document("Txt message");
        PhotoScannerFaxHP photoScannerFaxHP = new PhotoScannerFaxHP(printer,scanner,fax);
        photoScannerFaxHP.print(document);
        photoScannerFaxHP.scan(document);
        photoScannerFaxHP.sendDocument(document);
    }
}
