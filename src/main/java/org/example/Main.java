package org.example;

public class Main {

    public static void main(String[] args) {
        // DIY DI
        PrinterService con = new ConsolePrinter();
        PrinterService log = new SLF4JPrinter();

        App app = new App(log);
        app.doeMaarWat();
    }
}
