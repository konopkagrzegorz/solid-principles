package com.epam.prejap.isp.example1;

public class PhotoScannerFaxHP implements MultifunctionDevice {

    private Printer printer;
    private Scanner scanner;
    private Fax fax;

    public PhotoScannerFaxHP(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

    @Override
    public void sendDocument(Document document) {
        printer.print(document);
    }

    @Override
    public void print(Document document) {
        scanner.scan(document);
    }

    @Override
    public void scan(Document document) {
        fax.sendDocument(document);
    }
}
